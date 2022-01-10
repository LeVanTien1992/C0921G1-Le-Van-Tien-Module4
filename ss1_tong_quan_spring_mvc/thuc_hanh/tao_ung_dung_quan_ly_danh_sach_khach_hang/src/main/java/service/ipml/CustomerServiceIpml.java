package service.ipml;

import bean.Customer;
import repository.CustomerRepository;
import repository.ipml.CustomerRepositoryIpml;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceIpml implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryIpml();
    public List<Customer> displayCustomer() {
        return this.customerRepository.displayCustomer();
    }

    public Customer getCustomerById(int id) {
        return this.customerRepository.getCustomerById(id);
    }

    public static void main(String[] args) {
        CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();
        List<Customer> customerList = customerServiceIpml.displayCustomer();
        for (Customer c : customerList){
            System.out.println(c);
        }
    }
}
