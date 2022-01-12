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


    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    public void save(int id, Customer customer) {
        customerRepository.save(id, customer);
    }

    public Customer findById(int id) {
        return this.customerRepository.findById(id);
    }

    public void update(int id, Customer customer) {
        customerRepository.update(id, customer);
    }

    public void remove(int id) {
        customerRepository.remove(id);
    }
}
