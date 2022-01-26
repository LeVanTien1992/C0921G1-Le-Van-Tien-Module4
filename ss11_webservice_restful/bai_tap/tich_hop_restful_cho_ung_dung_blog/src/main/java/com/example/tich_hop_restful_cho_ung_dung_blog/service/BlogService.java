package com.example.tich_hop_restful_cho_ung_dung_blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.tich_hop_restful_cho_ung_dung_blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findByAuthor(String author, Pageable pageable);
    Page<Blog> findByCategory(Integer id, Pageable pageable);
    void save(Blog blog);
    Blog findById(Integer id);
    void remove(Integer id);

}
