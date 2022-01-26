package com.example.tich_hop_restful_cho_ung_dung_blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.tich_hop_restful_cho_ung_dung_blog.model.Blog;
import com.example.tich_hop_restful_cho_ung_dung_blog.service.BlogService;
import com.example.tich_hop_restful_cho_ung_dung_blog.service.CategoryService;

import java.util.List;
import java.util.Optional;

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

}
