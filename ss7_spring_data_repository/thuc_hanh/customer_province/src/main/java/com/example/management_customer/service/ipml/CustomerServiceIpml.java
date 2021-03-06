package com.example.management_customer.service.ipml;

import com.example.management_customer.model.Customer;
import com.example.management_customer.repository.CustomerRepository;
import com.example.management_customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceIpml implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> searchByName(String keyword) {
        return customerRepository.findByFirstNameContaining(keyword);
    }
}
