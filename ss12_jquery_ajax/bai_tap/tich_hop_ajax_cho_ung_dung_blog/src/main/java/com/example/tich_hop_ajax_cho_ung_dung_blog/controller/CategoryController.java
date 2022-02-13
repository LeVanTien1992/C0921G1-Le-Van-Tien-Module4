package com.example.tich_hop_ajax_cho_ung_dung_blog.controller;

import com.example.tich_hop_ajax_cho_ung_dung_blog.model.Category;
import com.example.tich_hop_ajax_cho_ung_dung_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category/api/v1")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAllCategory(){
        List<Category> categoryList =  categoryService.findAll();
        if(categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(categoryList, HttpStatus.OK);
        }
    }
}
