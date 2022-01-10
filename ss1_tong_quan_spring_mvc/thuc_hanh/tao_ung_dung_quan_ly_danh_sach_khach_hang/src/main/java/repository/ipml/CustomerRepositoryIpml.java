package repository.ipml;

import bean.Customer;
import repository.CustomerRepository;

import java.net.ConnectException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
}
