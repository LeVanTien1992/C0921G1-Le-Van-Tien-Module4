package com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.repository;

import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByFirstNameContaining(String keyword);
}
