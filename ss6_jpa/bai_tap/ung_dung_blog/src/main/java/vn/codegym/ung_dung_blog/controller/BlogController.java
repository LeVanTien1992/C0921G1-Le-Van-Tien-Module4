package vn.codegym.ung_dung_blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.ung_dung_blog.model.Blog;
import vn.codegym.ung_dung_blog.service.BlogService;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping(value = "/")
    public String listBlog(Model model){
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogList", blogList);
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
