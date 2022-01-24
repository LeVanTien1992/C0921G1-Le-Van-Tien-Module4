package com.example.ung_dung_muon_sach.controller;

import com.example.ung_dung_muon_sach.service.BookService;
import com.example.ung_dung_muon_sach.service.DetailBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private DetailBookService detailBookService;

    @GetMapping(value = "/")
    public String listBook(Model model){
        model.addAttribute("bookList", bookService.findAll());
        return "list";
    }
}
