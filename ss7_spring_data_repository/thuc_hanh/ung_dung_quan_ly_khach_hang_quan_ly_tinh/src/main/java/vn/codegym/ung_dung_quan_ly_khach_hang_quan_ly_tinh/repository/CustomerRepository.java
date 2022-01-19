package vn.codegym.ung_dung_quan_ly_khach_hang_quan_ly_tinh.repository;

import vn.codegym.ung_dung_quan_ly_khach_hang_quan_ly_tinh.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByFirstNameContaining(String keyword);
}
