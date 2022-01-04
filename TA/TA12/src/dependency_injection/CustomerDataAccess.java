package dependency_injection;

/*
This is the service class of the pattern.
 */
public class CustomerDataAccess implements ICustomerDataAccess {

    public String getCustomerName(int id) {
        //get the customer name from the db in real application
        return "Dummy Customer Name";
    }
}