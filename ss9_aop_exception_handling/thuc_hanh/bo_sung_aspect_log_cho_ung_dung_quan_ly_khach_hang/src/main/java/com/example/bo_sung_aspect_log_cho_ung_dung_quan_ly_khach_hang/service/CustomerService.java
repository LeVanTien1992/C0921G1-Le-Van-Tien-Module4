package com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.service;

import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    Customer findById(int id);
    void remove(int id);
    List<Customer> searchByName(String keyword);
}
