package com.example.bo_sung_aspect_log_cho_ung_dung_quan_ly_khach_hang.service;

import com.example.bo_sung_aspect_log_cho_ung_dung_quan_ly_khach_hang.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int id);
    void remove(int id);
    List<Customer> searchByName(String keyword);
}
