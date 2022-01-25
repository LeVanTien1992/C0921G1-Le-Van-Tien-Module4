package com.example.them_san_pham_vao_gio.service;

import com.example.them_san_pham_vao_gio.model.Product;
import com.example.them_san_pham_vao_gio.repository.IProductRepository;
import com.example.them_san_pham_vao_gio.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService {


    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }
}
