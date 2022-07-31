package workingWithMethods.dataAccess.concretes;

import workingWithMethods.dataAccess.abstracts.EmployeeDao;
import workingWithMethods.entities.concretes.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrameworkEmployeeDao implements EmployeeDao {
    List<Employee> employees = new ArrayList<>();
    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getAll() {

        return employees;
    }
}
