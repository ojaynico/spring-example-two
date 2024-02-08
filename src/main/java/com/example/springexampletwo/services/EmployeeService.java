package com.example.springexampletwo.services;

import com.example.springexampletwo.model.Employee;
import com.example.springexampletwo.services.impl.EmployeeImpl;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeImpl {

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setName(employee.getName() + " Omony");
        BigDecimal newSalary = employee.getSalary().add(BigDecimal.valueOf(50000));
        employee.setSalary(newSalary);

        return employee;
    }

    @Override
    public void deleteEmployee(Integer id) {

    }

    @Override
    public Employee getEmployeeById(Integer id) {
        List<Employee> employees = new ArrayList<>();

        Employee employeeOne = new Employee();
        employeeOne.setId(1);
        employeeOne.setName("Arnold");
        employeeOne.setAge(45);
        employeeOne.setSalary(BigDecimal.valueOf(2000000));

        employees.add(employeeOne);

        Employee employeeTwo = new Employee();
        employeeTwo.setId(2);
        employeeTwo.setName("Ivan");
        employeeTwo.setAge(26);
        employeeTwo.setSalary(BigDecimal.valueOf(5000000));

        employees.add(employeeTwo);

        Employee filtered = new Employee();

        for (Employee tmpEmployee : employees) {
            if (tmpEmployee.getId() == id) {
                filtered = tmpEmployee;
            }
        }

        return filtered;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeOne = new Employee();
        employeeOne.setId(1);
        employeeOne.setName("Arnold");
        employeeOne.setAge(45);
        employeeOne.setSalary(BigDecimal.valueOf(2000000));

        employees.add(employeeOne);

        Employee employeeTwo = new Employee();
        employeeTwo.setId(2);
        employeeTwo.setName("Ivan");
        employeeTwo.setAge(26);
        employeeTwo.setSalary(BigDecimal.valueOf(5000000));

        employees.add(employeeTwo);

        return employees;
    }

    @Override
    public Employee editEmployee(Employee employee) {
        employee.setName(employee.getName() + " Okello");
        BigDecimal newSalary = employee.getSalary().add(BigDecimal.valueOf(1000000));
        employee.setSalary(newSalary);

        return employee;
    }
}
