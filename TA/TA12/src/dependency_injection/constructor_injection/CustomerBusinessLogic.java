package dependency_injection.constructor_injection;

import dependency_injection.ICustomerBusinessLogic;
import dependency_injection.ICustomerDataAccess;

/*
This is the client class of the pattern.
 */
public class CustomerBusinessLogic implements ICustomerBusinessLogic {
    ICustomerDataAccess _dataAccess;

    public CustomerBusinessLogic(ICustomerDataAccess custDataAccess) {
        _dataAccess = custDataAccess;
    }

    public String getCustomerName(int id) {
        return _dataAccess.getCustomerName(id);
    }
}