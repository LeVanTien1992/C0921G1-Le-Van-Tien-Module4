package com.example.tich_hop_ajax_cho_ung_dung_blog.repository;

import com.example.tich_hop_ajax_cho_ung_dung_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
