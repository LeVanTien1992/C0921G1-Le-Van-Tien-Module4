package vn.codegym.service.ipml;

import vn.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.repository.CustomerRepository;
import vn.codegym.service.CustomerService;

import java.util.List;
@Service
public class CustomerServiceIpml implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> displayCustomer() {
        return this.customerRepository.displayCustomer();
    }

    public Customer getCustomerById(int id) {
        return this.customerRepository.getCustomerById(id);
    }

    public void updateCustomer(int id,Customer customer) {
        customerRepository.updateCustomer(id, customer);
    }

}
