package workingWithMethods.dataAccess.concretes;

import workingWithMethods.dataAccess.abstracts.CustomerDao;
import workingWithMethods.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Hibernate ile eklendi. "+ customer);
    }

    @Override
    public boolean customerExists(Customer customer) {
        return true;
    }
}
