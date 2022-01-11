package vn.codegym.repository.ipml;

import vn.codegym.model.Customer;
import org.springframework.stereotype.Repository;
import vn.codegym.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepositoryIpml implements CustomerRepository {

   private List<Customer> customerList;
    public List<Customer> getAllCustomer(){
        customerList = new ArrayList<Customer>();
        customerList.add(new Customer(0, "Trang", "trang@gmail.com", "Sài Gòn"));
        customerList.add(new Customer(1, "Linh", "linh@gmail.com", "Quảng Trị"));
        customerList.add(new Customer(2, "Tony", "tony@gmail.com", "Quảng Nam"));
        customerList.add(new Customer(3, "Bình", "binh@gmail.com", "Đà Nẵng"));
        customerList.add(new Customer(4, "Tiến", "tien@gmail.com", "Đà Nẵng"));

        return customerList;
    }
    public List<Customer> displayCustomer() {
        return new ArrayList<Customer>(getAllCustomer());
    }

    public Customer getCustomerById(int id) {
        return customerList.get(id);
    }

    public void updateCustomer(int id, Customer customer) {
        customerList.add(id, customer);
    }
}
