package com.example.hoan_thien_gio_hang.controller;

import com.example.hoan_thien_gio_hang.dto.CartDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CartController {

    @GetMapping(value = "/cart")
    public String listCart(@SessionAttribute("cart")CartDto cartDto, Model model){
        model.addAttribute("cartDto", cartDto);
        return "cart";
    }

}
