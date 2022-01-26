package com.example.quan_ly_khach_hang_su_dung_restful.service;

import com.example.quan_ly_khach_hang_su_dung_restful.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Optional<Customer> findById(long id);
    void remove(long id);
}
