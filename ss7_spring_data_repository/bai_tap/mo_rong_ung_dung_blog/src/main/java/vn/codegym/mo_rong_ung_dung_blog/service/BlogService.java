package vn.codegym.ung_dung_blog.service;

import vn.codegym.ung_dung_blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    void save(Blog blog);
    Blog findById(Integer id);
    void remove(Integer id);
}
