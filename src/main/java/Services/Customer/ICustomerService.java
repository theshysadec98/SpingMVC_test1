package Services.Customer;

import Models.Customer;
import Models.Province;
import Services.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
}
