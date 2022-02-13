package com.example.tich_hop_ajax_cho_ung_dung_blog.service.ipml;

import com.example.tich_hop_ajax_cho_ung_dung_blog.model.Category;
import com.example.tich_hop_ajax_cho_ung_dung_blog.repository.CategoryRepository;
import com.example.tich_hop_ajax_cho_ung_dung_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceIpml implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
