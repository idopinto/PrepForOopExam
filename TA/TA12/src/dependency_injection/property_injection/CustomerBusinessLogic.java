package dependency_injection.property_injection;

import dependency_injection.ICustomerBusinessLogic;
import dependency_injection.ICustomerDataAccess;

/*
This is the client class of the pattern.
 */
public class CustomerBusinessLogic implements ICustomerBusinessLogic {
    private ICustomerDataAccess _dataAccess;

    public String getCustomerName(int id) {
        return _dataAccess.getCustomerName(id);
    }

    public void setDataAccess(ICustomerDataAccess dataAccess) {
        _dataAccess = dataAccess;
    }

    public ICustomerDataAccess getDataAccess() {
        return _dataAccess;
    }
}