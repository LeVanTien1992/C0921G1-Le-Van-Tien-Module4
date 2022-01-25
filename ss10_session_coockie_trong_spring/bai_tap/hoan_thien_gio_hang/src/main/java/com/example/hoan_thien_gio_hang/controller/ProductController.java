package com.example.hoan_thien_gio_hang.controller;

import com.example.hoan_thien_gio_hang.dto.CartDto;
import com.example.hoan_thien_gio_hang.dto.ProductDto;
import com.example.hoan_thien_gio_hang.model.Product;
import com.example.hoan_thien_gio_hang.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@SessionAttributes("cart")// khai báo session có tên là cart
public class ProductController {

    @Autowired
    private ProductService productService;

    // khởi tạo giá trị mặc định cho session cartDto
    @ModelAttribute("cart")
    public CartDto initCart(){
        return new CartDto();
    }

    @GetMapping(value = "/")
    public String listProduct(Model model){
        model.addAttribute("productList", productService.findAll());
        return "list";
    }

    @GetMapping(value = "/add/{id}")
    public String addToCart(@PathVariable long id,
                            // gọi session cartDto ra sài
                            @SessionAttribute(value = "cart", required = false) CartDto cartDto){
        Optional<Product> productOptional = productService.findById(id);

        if(productOptional.isPresent()){
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(), productDto);

            // thêm productDto vào trong session cart
            cartDto.addProduct(productDto);
        }
        return "redirect:/cart";
    }
}
