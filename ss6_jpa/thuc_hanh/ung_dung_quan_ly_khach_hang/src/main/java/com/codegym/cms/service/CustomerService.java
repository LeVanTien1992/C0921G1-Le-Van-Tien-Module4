package com.codegym.cms.service;

import com.codegym.cms.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements IGeneralService{

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Object findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Object o) {
        customerRepository.save(o);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
