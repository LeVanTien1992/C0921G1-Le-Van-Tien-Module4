package vn.codegym.repository;

import vn.codegym.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void remove(int id);
    List<Product> findByName(String name);
    boolean checkSearch(String name);
}
