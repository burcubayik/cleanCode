package workingWithMethods.business.abstracts;

import workingWithMethods.entities.concretes.Customer;

public interface CustomerService {
   void  add(Customer customer) throws Exception;
   void addByOtherBusiness(Customer customer) throws Exception;
}
