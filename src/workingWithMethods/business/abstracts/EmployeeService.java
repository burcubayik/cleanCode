package workingWithMethods.business.abstracts;

import workingWithMethods.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    List<Employee> getAll();
}
