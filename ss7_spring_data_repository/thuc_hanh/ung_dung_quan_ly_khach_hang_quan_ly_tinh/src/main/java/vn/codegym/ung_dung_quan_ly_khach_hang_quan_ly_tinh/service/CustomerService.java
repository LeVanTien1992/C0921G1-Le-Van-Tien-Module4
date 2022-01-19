package vn.codegym.ung_dung_quan_ly_khach_hang_quan_ly_tinh.service;

import vn.codegym.ung_dung_quan_ly_khach_hang_quan_ly_tinh.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Page<Customer>  findAll(Pageable pageable);
    void save(Customer customer);
    Customer findById(int id);
    void remove(int id);
    List<Customer> searchByName(String keyword);
}
