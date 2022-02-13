package com.example.tich_hop_ajax_cho_ung_dung_blog.service.ipml;

import com.example.tich_hop_ajax_cho_ung_dung_blog.model.Blog;
import com.example.tich_hop_ajax_cho_ung_dung_blog.repository.BlogRepository;
import com.example.tich_hop_ajax_cho_ung_dung_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceIpml implements BlogService {
    @Autowired
    private BlogRepository repository;

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Blog> findByAuthor(String author, Pageable pageable) {
        return repository.findByAuthorContaining(author, pageable);
    }

    @Override
    public Page<Blog> findByCategory(Integer id, Pageable pageable) {
        return repository.findByCategoryId(id, pageable);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public Blog findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
