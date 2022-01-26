package com.example.ung_dung_muon_sach.controller;

import com.example.ung_dung_muon_sach.model.Book;
import com.example.ung_dung_muon_sach.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping(value = "/")
    public String listBook(Model model){
        model.addAttribute("bookList", bookService.findAll());
        return "list";
    }

    @GetMapping(value = "/formCreate")
    public String showFormCreate(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "create";
    }

    @PostMapping(value = "/create")
    public String saveBook(@ModelAttribute Book book){
        bookService.save(book);
        return "redirect:/";
    }

}
