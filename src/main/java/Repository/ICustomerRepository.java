package Repository;

import Models.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
