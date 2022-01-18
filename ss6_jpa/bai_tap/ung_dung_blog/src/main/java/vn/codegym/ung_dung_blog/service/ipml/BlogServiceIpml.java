package vn.codegym.ung_dung_blog.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_blog.model.Blog;
import vn.codegym.ung_dung_blog.repository.BlogRepository;
import vn.codegym.ung_dung_blog.service.BlogService;

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
