package workingWithMethods.dataAccess.concretes;

import workingWithMethods.dataAccess.abstracts.CustomerDao;
import workingWithMethods.entities.concretes.Customer;

public class FrameworkCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Framework ile eklendi. " + customer);
    }

    @Override
    public boolean customerExists(Customer customer) {
        return true;
    }
}
