package dependency_injection.method_injection;

import dependency_injection.ICustomerBusinessLogic;
import dependency_injection.ICustomerDataAccess;

/*
This is the client class of the pattern.
 */
public class CustomerBusinessLogic implements IDataAccessDependency, ICustomerBusinessLogic {
    private ICustomerDataAccess _dataAccess;

    public String getCustomerName(int id) {
        return _dataAccess.getCustomerName(id);
    }

    public void setDependency(ICustomerDataAccess customerDataAccess) {
        _dataAccess = customerDataAccess;
    }
}