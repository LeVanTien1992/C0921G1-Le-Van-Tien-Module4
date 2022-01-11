package vn.codegym.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
    @GetMapping(value = "/customer")
    public String getAllCustomer(Model model){
        List<Customer> customerList = customerService.displayCustomer();
        model.addAttribute("cList", customerList);
        return "index";
    }
    @GetMapping("/customer/{id}")
    public ModelAndView showInformation(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("update");
        Customer customer = customerService.getCustomerById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView ;
    }

    @PostMapping(value = "/customer")
    public String updateCustomer(@RequestParam int id,
                                 @RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String address

    ) {
        Customer customer = new Customer(id, name, email, address);
        customerService.updateCustomer(id, customer);
        return "index";
    }


}
