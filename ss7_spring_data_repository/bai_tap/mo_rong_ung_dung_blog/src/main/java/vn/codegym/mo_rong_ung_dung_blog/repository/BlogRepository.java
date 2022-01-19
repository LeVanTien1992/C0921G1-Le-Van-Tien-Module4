package vn.codegym.ung_dung_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository; //  /
import org.springframework.data.repository.CrudRepository; // định nghĩa nhũng phương thức CRUD
import org.springframework.data.repository.PagingAndSortingRepository;// phân trang với sắp xếp
import org.springframework.stereotype.Repository;
import vn.codegym.ung_dung_blog.model.Blog;
@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
