package com.example.validate_form_dang_ky.controller;

import com.example.validate_form_dang_ky.dto.PhoneNumber;
import com.example.validate_form_dang_ky.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping(value = "/")
    public String formRegister(Model model){
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping(value = "/result")
    public String result(@Valid @ModelAttribute ("user")User user,
                         BindingResult bindingResult,
                         Model model){
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber(user.getPhoneNumber());
        new PhoneNumber().validate(phoneNumber, bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "/index";
        }else {
            model.addAttribute("user", user);
            return "/result";
        }
    }
}
