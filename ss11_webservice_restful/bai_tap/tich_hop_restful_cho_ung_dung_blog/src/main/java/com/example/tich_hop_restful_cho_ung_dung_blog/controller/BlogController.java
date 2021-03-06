package com.example.tich_hop_restful_cho_ung_dung_blog.controller;

import com.example.tich_hop_restful_cho_ung_dung_blog.controller.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.tich_hop_restful_cho_ung_dung_blog.controller.model.Blog;
import com.example.tich_hop_restful_cho_ung_dung_blog.service.BlogService;
import com.example.tich_hop_restful_cho_ung_dung_blog.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/blog")
    public ResponseEntity<List<Blog>> findAllBlog(){
        List<Blog> blogList = blogService.findAll();
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(blogList, HttpStatus.OK);
        }
    }

    @GetMapping(value = "/category")
    public ResponseEntity<List<Category>> findAllCategory(){
        List<Category> categoryList = categoryService.findAll();
        if(categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(categoryList, HttpStatus.OK);
        }
    }

}
