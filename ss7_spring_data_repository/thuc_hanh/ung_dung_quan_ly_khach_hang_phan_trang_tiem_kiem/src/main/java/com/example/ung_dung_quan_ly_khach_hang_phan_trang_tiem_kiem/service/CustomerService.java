package com.example.management_customer.service;

import com.example.management_customer.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int id);
    void remove(int id);
    List<Customer> searchByName(String keyword);
}
