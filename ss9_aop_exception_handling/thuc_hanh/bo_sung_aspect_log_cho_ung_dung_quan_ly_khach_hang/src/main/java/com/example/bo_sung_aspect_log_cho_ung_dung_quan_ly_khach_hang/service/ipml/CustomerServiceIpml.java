package com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.service.ipml;

import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.model.Customer;
import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.repository.CustomerRepository;
import com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceIpml implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> searchByName(String keyword) {
        return customerRepository.findByFirstNameContaining(keyword);
    }
}
