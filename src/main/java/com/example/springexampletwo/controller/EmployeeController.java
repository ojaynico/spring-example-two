package com.example.springexampletwo.controller;

import com.example.springexampletwo.model.Employee;
import com.example.springexampletwo.services.EmployeeService;
import com.example.springexampletwo.services.impl.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController implements EmployeeImpl {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("add")
    @Override
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("delete/{id}")
    @Override
    public void deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("get_by_id/{id}")
    @Override
    public Employee getEmployeeById(@PathVariable("id") Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("get_all")
    @Override
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("edit")
    @Override
    public Employee editEmployee(@RequestBody Employee employee) {
        return employeeService.editEmployee(employee);
    }
}
