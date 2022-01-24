package com.example.ung_dung_muon_sach.service.ipml;

import com.example.ung_dung_muon_sach.model.Order;
import com.example.ung_dung_muon_sach.repository.OrderRepository;
import com.example.ung_dung_muon_sach.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceIpml implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }
}
