package vn.codegym.repository.ipml;

import vn.codegym.model.Customer;
import org.springframework.stereotype.Repository;
import vn.codegym.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepositoryIpml implements CustomerRepository {

    private static Map<Integer, Customer> customerList;
    static {
        customerList = new HashMap<Integer, Customer>();
        customerList.put(1, new Customer(1, "Trang", "trang@gmail.com", "Sài Gòn"));
        customerList.put(2, new Customer(2, "Linh", "linh@gmail.com", "Quảng Trị"));
        customerList.put(3, new Customer(3, "Tony", "tony@gmail.com", "Quảng Nam"));
        customerList.put(4, new Customer(4, "Bình", "binh@gmail.com", "Đà Nẵng"));
        customerList.put(5, new Customer(5, "Tiến", "tien@gmail.com", "Đà Nẵng"));
    }

    public List<Customer> findAll() {
        return new ArrayList<Customer>(customerList.values());
    }

    public void save(int id, Customer customer) {
        customerList.put(customer.getId(),customer);
    }

    public Customer findById(int id) {
        return customerList.get(id);
    }

    public void update(int id, Customer customer) {
        customerList.put(id, customer);
    }

    public void remove(int id) {
        customerList.remove(id);
    }
}
