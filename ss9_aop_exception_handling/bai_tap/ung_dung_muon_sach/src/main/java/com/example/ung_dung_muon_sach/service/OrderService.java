package com.example.ung_dung_muon_sach.service;

import com.example.ung_dung_muon_sach.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
    void save(Order order);
}
