package vn.codegym.ung_dung_quan_ly_khach_hang_quan_ly_tinh.controller;

import vn.codegym.ung_dung_quan_ly_khach_hang_quan_ly_tinh.model.Customer;
import vn.codegym.ung_dung_quan_ly_khach_hang_quan_ly_tinh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/")
    public String listCustomer(Model model, @PageableDefault (size = 2)Pageable pageable){
        Page<Customer> customerList = customerService.findAll(pageable);
        model.addAttribute("customerList", customerList);
        return "list";
    }

    @GetMapping(value = "createForm")
    public String showFormCustomer(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "create";
    }
    @PostMapping(value = "/create")
    public String createCustomer(@ModelAttribute Customer customer,
                                 RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "create customer " +customer.getFirstName()+ " success");
        return "redirect:/";
    }

    @GetMapping(value = "/update/{id}")
    public String showFormUpdate(@PathVariable int id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "update";
    }

    @PostMapping(value = "/update")
    public String updateCustomer(@ModelAttribute Customer customer,
                                 RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "update customer " +customer.getFirstName()+ " success");
        return "redirect:/";
    }


    @GetMapping(value = "/view/{id}")
    public String showForm(@PathVariable int id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "view";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteCustomer(@PathVariable int id,
                                 RedirectAttributes redirectAttributes){
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("message", "delete customer success");
        return "redirect:/";
    }

    @GetMapping(value = "/search")
    public String searchByName(@RequestParam("result") String keyword, Model model){
        List<Customer> customerList =customerService.searchByName(keyword);
        model.addAttribute("customerList", customerList);
        return "list";
    }
}
