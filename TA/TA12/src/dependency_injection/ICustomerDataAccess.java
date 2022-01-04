package dependency_injection;

/*
This is an interface for the service class of the pattern.
 */
public interface ICustomerDataAccess {
    String getCustomerName(int id);
}