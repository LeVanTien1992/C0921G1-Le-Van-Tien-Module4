package com.example.quan_ly_khach_hang_su_dung_restful.repository;

import com.example.quan_ly_khach_hang_su_dung_restful.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
