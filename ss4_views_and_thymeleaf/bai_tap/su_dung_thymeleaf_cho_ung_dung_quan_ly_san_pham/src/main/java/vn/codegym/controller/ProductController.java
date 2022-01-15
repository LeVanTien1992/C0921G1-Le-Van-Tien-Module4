package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Product;
import vn.codegym.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public String list(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "list";
    }

    @GetMapping(value = "/create")
    public String formCreate(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "create";
    }

    @PostMapping(value = "/createProduct")
    public String createProduct(@ModelAttribute Product product,
                                RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "Save product " +product.getName()+ "  success");
        return "redirect:/";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteProduct(@PathVariable int id,
                                RedirectAttributes redirectAttributes){
        productService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Delete product success");
        return "redirect:/";
    }

    @GetMapping(value = "/update/{id}")
    public String updateById(@PathVariable int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "update";
    }

    @PostMapping(value = "/updateProduct")
    public String updateProduct(@ModelAttribute Product product,
                                RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "Update product success");
        return "redirect:/";
    }

    @GetMapping(value = "/view/{id}")
    public String viewProduct(@PathVariable int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("view", product);
        return "view";
    }

    @GetMapping(value = "/searchByName")
    public String search(@RequestParam String search, Model model){
        if (productService.checkSearch(search)){
            List<Product> productList =  productService.findByName(search);
            model.addAttribute("productList", productList);
        }else {
            List<Product> productList = productService.findAll();
            model.addAttribute("productList", productList);
            model.addAttribute("msgsearch", "khoong cos cos gif");
        }
        return "list";
    }
}
