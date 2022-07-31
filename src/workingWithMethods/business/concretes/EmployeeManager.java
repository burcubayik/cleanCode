package workingWithMethods.business.concretes;

import workingWithMethods.business.abstracts.EmployeeService;
import workingWithMethods.dataAccess.abstracts.EmployeeDao;
import workingWithMethods.entities.concretes.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    EmployeeDao employeeDao;

    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
