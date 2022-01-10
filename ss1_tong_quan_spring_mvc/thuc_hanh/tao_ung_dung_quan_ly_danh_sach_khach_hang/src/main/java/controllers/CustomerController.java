package controllers;

import bean.Customer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.CustomerService;
import service.ipml.CustomerServiceIpml;

import java.util.List;

public class CustomerController {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    @GetMapping(value = "/customer")
    public String getAllCustomer(Model model){
        CustomerService customerService = new CustomerServiceIpml();
        List<Customer> customerList = customerService.displayCustomer();
        model.addAttribute("cList", customerList);
        return "index";
    }
}
