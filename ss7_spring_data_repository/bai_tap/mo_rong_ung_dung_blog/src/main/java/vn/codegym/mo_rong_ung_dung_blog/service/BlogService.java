package vn.codegym.mo_rong_ung_dung_blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.mo_rong_ung_dung_blog.model.Blog;
import vn.codegym.mo_rong_ung_dung_blog.model.Blog;

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
