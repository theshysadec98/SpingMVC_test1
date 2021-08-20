package Repository;

import Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> findByName(String firstName) {
        return customerRepository.findByName(firstName);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }

}
