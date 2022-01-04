package dependency_injection.no_injection;

import dependency_injection.ICustomerBusinessLogic;
import dependency_injection.ICustomerDataAccess;

public class CustomerBusinessLogic implements ICustomerBusinessLogic {
    ICustomerDataAccess _dataAccess;

    public CustomerBusinessLogic() {
        _dataAccess = DataAccessFactory.getCustomerDataAccessObj();
        // Alternatively, could be just:
        // _dataAccess = new CustomerDataAccess();
    }

    public String getCustomerName(int id) {
        return _dataAccess.getCustomerName(id);
    }
}