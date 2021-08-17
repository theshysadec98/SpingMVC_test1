package Services;

import Models.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{
    public static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@SBTC.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Bill", "bill@SBTC.vn", "Danang"));
        customers.put(3, new Customer(3, "Alex", "alex@SBTC.vn", "Saigon"));
        customers.put(4, new Customer(4, "Adam", "adam@SBTC.vn", "Beijin"));
        customers.put(5, new Customer(5, "Sophia", "sophia@SBTC.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@SBTC.vn", "Newyork"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findByID(int id) {
        return customers.get(id);
    }

    @Override
    public void update(Customer customer, int id) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
