package workingWithMethods;

import workingWithMethods.business.abstracts.CustomerService;
import workingWithMethods.business.abstracts.EmployeeService;
import workingWithMethods.business.concretes.CustomerManager;
import workingWithMethods.business.concretes.EmployeeManager;
import workingWithMethods.core.adapters.KpsServiceAdapter;
import workingWithMethods.dataAccess.concretes.FrameworkEmployeeDao;
import workingWithMethods.dataAccess.concretes.HibernateCustomerDao;
import workingWithMethods.entities.concretes.Customer;
import workingWithMethods.entities.concretes.Employee;
import workingWithMethods.entities.concretes.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        employeeDemo();



    }
    private static  void  customerDemo() throws Exception {
        Customer customer = new Customer(1,"Burcu","Bayık","1234",1998,2);
        CustomerService customerService = new CustomerManager(new HibernateCustomerDao(),new KpsServiceAdapter());

        customerService.add(customer);
    }
    private  static  void employeeDemo(){
        EmployeeService employeeService = new EmployeeManager(new FrameworkEmployeeDao());
        Employee employee = new Employee(1,"Betül","Kayam", "22222",1995,10000000);
        employeeService.add(employee);
        for (Employee item:employeeService.getAll()) {
            System.out.println(item.getFirstName());
        }

    }
}
