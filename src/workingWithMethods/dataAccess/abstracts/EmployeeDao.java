package workingWithMethods.dataAccess.abstracts;

import workingWithMethods.entities.concretes.Employee;

import java.util.List;

public interface EmployeeDao {
    void add(Employee employee);
    List<Employee> getAll();
}
