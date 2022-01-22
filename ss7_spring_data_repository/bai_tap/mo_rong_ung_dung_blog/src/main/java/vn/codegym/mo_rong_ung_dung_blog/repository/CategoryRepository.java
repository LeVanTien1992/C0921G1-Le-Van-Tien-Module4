package vn.codegym.mo_rong_ung_dung_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.mo_rong_ung_dung_blog.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
