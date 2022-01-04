package dependency_injection.constructor_injection;

import dependency_injection.CustomerDataAccess;
import dependency_injection.ICustomerDataAccess;

/*
This is the injector class of the pattern.
 */
public class CustomerService implements ICustomerDataAccess {
    CustomerBusinessLogic _customerBL;

    public CustomerService() {
        _customerBL = new CustomerBusinessLogic(new CustomerDataAccess());
    }

    public String getCustomerName(int id) {
        return _customerBL.getCustomerName(id);
    }
}