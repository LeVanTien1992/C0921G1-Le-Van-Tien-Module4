package vn.codegym.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.service.CustomerService;
import vn.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService ;

    @GetMapping(value = "/")
    public String getAllCustomer(Model model){
        model.addAttribute("cList", customerService.findAll());
        return "index";
    }


    @GetMapping(value = "/customer/{id}")
    public String viewCustomerById(
            @PathVariable(value = "id") int view, Model model){

        Customer customer = customerService.findById(view);
        model.addAttribute("cl", customer);
        return "view";
    }


    @GetMapping(value = "/customer")
    public String deleteCustomer(
            @RequestParam int id){
        customerService.remove(id);
        return "redirect:/";
    }


    @GetMapping(value = "/customer/create")
    public String create(){
        return "create";
    }


    @PostMapping("/customer/save")
    public String save(@RequestParam int id,
                       @RequestParam String name,
                       @RequestParam String email,
                       @RequestParam String address) {

        Customer customer = new Customer(id, name, email, address);
        customerService.save(id, customer);
        return "redirect:/";
    }


    @GetMapping(value = "/customer/update/{id}")
    public String updateCustomerById(
            @PathVariable(value = "id") int updateById, Model model){
        Customer customer = customerService.findById(updateById);
        model.addAttribute("customer", customer);
        return "update";
    }


    @PostMapping(value = "/customer/update")
    public String updateCustomer(@RequestParam int id,
                                 @RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String address){
        Customer customer = new Customer(id, name, email, address);
        customerService.update(id, customer);
        return "redirect:/";
    }
}
