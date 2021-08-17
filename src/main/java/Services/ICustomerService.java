package Services;

import Models.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findByID(int id);
    void update(Customer customer, int id);
    void remove(int id);
}
