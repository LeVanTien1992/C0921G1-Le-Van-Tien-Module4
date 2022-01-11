package vn.codegym.repository;

import vn.codegym.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> displayCustomer();
    Customer getCustomerById(int id);
    void updateCustomer(int id, Customer customer);
}
