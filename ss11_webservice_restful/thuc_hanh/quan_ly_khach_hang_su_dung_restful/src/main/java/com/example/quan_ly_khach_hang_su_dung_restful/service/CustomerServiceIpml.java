package com.example.quan_ly_khach_hang_su_dung_restful.service;

import com.example.quan_ly_khach_hang_su_dung_restful.model.Customer;
import com.example.quan_ly_khach_hang_su_dung_restful.repository.CustomerRepository;
import com.example.quan_ly_khach_hang_su_dung_restful.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceIpml implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public Optional<Customer> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);
    }
}
