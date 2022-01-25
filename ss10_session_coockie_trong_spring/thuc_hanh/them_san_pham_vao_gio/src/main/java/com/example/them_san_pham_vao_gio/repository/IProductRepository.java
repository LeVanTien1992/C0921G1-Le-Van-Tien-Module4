package com.example.them_san_pham_vao_gio.repository;

import com.example.them_san_pham_vao_gio.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
