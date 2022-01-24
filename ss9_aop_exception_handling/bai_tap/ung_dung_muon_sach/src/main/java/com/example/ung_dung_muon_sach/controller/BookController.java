package com.example.ung_dung_muon_sach.controller;

import com.example.ung_dung_muon_sach.model.Book;
import com.example.ung_dung_muon_sach.model.Order;
import com.example.ung_dung_muon_sach.service.BookService;
import com.example.ung_dung_muon_sach.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/")
    public String listBook(Model model){
        model.addAttribute("bookList", bookService.findAll());
        return "list";
    }

    @GetMapping(value = "/view/{id}")
    public String viewBook(Model model, @PathVariable long id){
        Order order = orderService.findById(id);
        model.addAttribute("order", order);
        return "view_detail";
    }

    @PostMapping(value = "/view")
    public String orderBook(@PathVariable long id){
        Order order = new Order();

        Book book = bookService.findById(id);
        book.setQuantity(book.getQuantity()-1);

        List<Order> orders = book.getOrderList();
        orders.add(order);
        book.setOrderList(orders);

        orderService.save(order);
        bookService.save(book);
        return "redirect:/";
    }

}
