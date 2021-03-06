package com.example.bo_sung_aspect_log_cho_ung_dung_quan_ly_khach_hang.repository;

import com.example.bo_sung_aspect_log_cho_ung_dung_quan_ly_khach_hang.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByFirstNameContaining(String keyword);
}
