package com.example.tich_hop_ajax_cho_ung_dung_blog.repository;

import com.example.tich_hop_ajax_cho_ung_dung_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findByAuthorContaining(String author, Pageable pageable);
    @Query(value = "select * from blog where blog.category_id = :id", nativeQuery = true)
    Page<Blog> findByCategoryId(@Param("id") Integer id, Pageable pageable);

}
