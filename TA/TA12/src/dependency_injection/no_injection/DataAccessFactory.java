package dependency_injection.no_injection;

import dependency_injection.CustomerDataAccess;
import dependency_injection.ICustomerDataAccess;

public class DataAccessFactory {
    public static ICustomerDataAccess getCustomerDataAccessObj() {
        return new CustomerDataAccess();
    }
}