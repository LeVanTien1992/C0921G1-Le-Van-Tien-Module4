package com.example.quan_ly_khach_hang_su_dung_restful.controller;

import com.example.quan_ly_khach_hang_su_dung_restful.dto.CustomerDto;
import com.example.quan_ly_khach_hang_su_dung_restful.model.Customer;
import com.example.quan_ly_khach_hang_su_dung_restful.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer/api/v1")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;


    // hiện thị list
    @GetMapping()
    public ResponseEntity<List<Customer>> findAllCustomer(){
        List<Customer> customerList =  customerService.findAll();
        if (customerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    // show detail customer with id
    @GetMapping("/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        if (!customer.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer.get(), HttpStatus.OK);

//        Customer customer = customerService.findById(id);
//        if (customer== null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(customer, HttpStatus.OK);
    }


    // thêm customer
    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDto customerDto) {

        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        return new ResponseEntity(HttpStatus.OK);

    }


    // update customer
    @PutMapping(value = "/{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody CustomerDto customerDto,
                                                   @PathVariable long id){

        Optional<Customer> currentCustomer = customerService.findById(id);
        if(currentCustomer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentCustomer.get().setFirstName(customerDto.getFirstName());
        currentCustomer.get().setLastName(customerDto.getLastName());

        customerService.save(currentCustomer.get());

        return new ResponseEntity<>(currentCustomer.get(), HttpStatus.OK);
            //  không làm Optional
//        Customer currentCustomer = customerService.findById(id);
//        if(currentCustomer == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        currentCustomer.get().setFirstName(customerDto.getFirstName());
//        currentCustomer.get().setLastName(customerDto.getLastName());
//
//        customerService.save(currentCustomer.get());
//
//        return new ResponseEntity<>(currentCustomer, HttpStatus.OK);
    }
     //delete customer
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable long id){
        Optional<Customer> currentCustomer = customerService.findById(id);
        if(currentCustomer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(id);
        return new ResponseEntity<>(currentCustomer.get(),HttpStatus.OK);
//        không làm Optional
//        Customer currentCustomer = customerService.findById(id);
//        if(currentCustomer == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        customerService.remove(id);
//        return new ResponseEntity<>(currentCustomer,HttpStatus.OK);

    }
}
