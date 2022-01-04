package dependency_injection.method_injection;

import dependency_injection.ICustomerDataAccess;

/*
This is an interface for the client class of the pattern.
 */
interface IDataAccessDependency {
    void setDependency(ICustomerDataAccess customerDataAccess);
}