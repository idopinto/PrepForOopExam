package dependency_injection.method_injection;

import dependency_injection.CustomerDataAccess;
import dependency_injection.ICustomerDataAccess;

public class CustomerService implements ICustomerDataAccess {
    CustomerBusinessLogic _customerBL;

    public CustomerService() {
        _customerBL = new CustomerBusinessLogic();
//        ((IDataAccessDependency) _customerBL).setDependency(new CustomerDataAccess());
        _customerBL.setDependency(new CustomerDataAccess());
    }

    public String getCustomerName(int id) {
        return _customerBL.getCustomerName(id);
    }
}