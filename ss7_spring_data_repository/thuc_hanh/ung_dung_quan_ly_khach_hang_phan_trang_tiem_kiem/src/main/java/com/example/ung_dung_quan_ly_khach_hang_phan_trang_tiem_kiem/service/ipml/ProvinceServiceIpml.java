package com.example.management_customer.service.ipml;

import com.example.management_customer.model.Province;
import com.example.management_customer.repository.ProvinceRepository;
import com.example.management_customer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceServiceIpml implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return null;
    }
}
