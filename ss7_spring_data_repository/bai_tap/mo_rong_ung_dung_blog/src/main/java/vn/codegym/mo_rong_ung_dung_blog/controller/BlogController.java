package vn.codegym.mo_rong_ung_dung_blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.mo_rong_ung_dung_blog.model.Blog;
import vn.codegym.mo_rong_ung_dung_blog.model.Category;
import vn.codegym.mo_rong_ung_dung_blog.service.BlogService;
import vn.codegym.mo_rong_ung_dung_blog.model.Blog;
import vn.codegym.mo_rong_ung_dung_blog.service.BlogService;
import vn.codegym.mo_rong_ung_dung_blog.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/")
    public String listBlog(Optional<String> key_word,
                           Optional<Integer> cateId,
                            Model model,
                           @PageableDefault(size = 2) Pageable pageable){
        model.addAttribute("categoryList", categoryService.findAll());
        // Th 1: Không nhập vào ô tìm kiếm author
        if(!key_word.isPresent()){

            // Th 2; Không nhâp vào ô tìm kiếm select cateId
            if(!cateId.isPresent()){
                model.addAttribute("blogList", blogService.findAll(pageable));
            }else {
                model.addAttribute("blogList", blogService.findByCategory(cateId.get(), pageable));
            }
        }else {
            model.addAttribute("blogList", blogService.findByAuthor(key_word.get(), pageable));
        }
//
        return "list";
    }

    @GetMapping(value = "/createForm")
    public String formCreate(Model model){
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        return "create";
    }

    @PostMapping(value = "create")
    public String createBlog(@ModelAttribute Blog blog,
                             RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "create blog " +blog.getTopic()+ " success");
        return "redirect:/";
    }

    @GetMapping(value = "/update/{id}")
    public String formUpdate(@PathVariable Integer id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "update";
    }

    @PostMapping(value = "update")
    public String updateBlog(@ModelAttribute Blog blog,
                             RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "update blog " +blog.getTopic()+ " success");
        return "redirect:/";
    }

    @GetMapping(value = "/view/{id}")
    public String showFormView(@PathVariable Integer id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "view";
    }

//    @GetMapping(value = "/delete/{id}")
//    public String showFormDelete(@PathVariable Integer id, Model model
//                                 ){
//        Blog blog = blogService.findById(id);
//        model.addAttribute("blog", blog);
//        return "delete";
//    }
//

    @GetMapping(value = "/delete/{id}")
    public String deleteBlog(@PathVariable Integer id,
                             RedirectAttributes redirectAttributes){
        blogService.remove(id);
        redirectAttributes.addFlashAttribute("message", "DELETE BLOG SUCCESS");
        return "redirect:/";
    }
}
