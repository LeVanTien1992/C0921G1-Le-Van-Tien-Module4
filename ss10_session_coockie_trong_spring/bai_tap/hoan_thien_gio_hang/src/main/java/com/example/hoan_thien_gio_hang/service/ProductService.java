package com.example.hoan_thien_gio_hang.service;

import com.example.hoan_thien_gio_hang.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(long id);
    void save(Product product);
}
