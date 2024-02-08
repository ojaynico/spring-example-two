package com.example.springexampletwo.services.impl;

import com.example.springexampletwo.model.Employee;

import java.util.List;

public interface EmployeeImpl {
    Employee addEmployee(Employee employee);

    void deleteEmployee(Integer id);

    Employee getEmployeeById(Integer id);

    List<Employee> getAllEmployees();

    Employee editEmployee(Employee employee);
}
