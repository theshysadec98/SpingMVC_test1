package Repository;

import Models.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
