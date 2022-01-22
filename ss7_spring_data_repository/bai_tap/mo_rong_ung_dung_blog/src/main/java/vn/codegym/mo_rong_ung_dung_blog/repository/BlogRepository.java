package vn.codegym.mo_rong_ung_dung_blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.mo_rong_ung_dung_blog.model.Blog;
import vn.codegym.mo_rong_ung_dung_blog.model.Blog;
@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findByAuthorContaining(String author, Pageable pageable);
    @Query(value = "select * from blog where blog.category_id = :id", nativeQuery = true)
    Page<Blog> findByCategoryId(@Param("id") Integer id, Pageable pageable);

}
