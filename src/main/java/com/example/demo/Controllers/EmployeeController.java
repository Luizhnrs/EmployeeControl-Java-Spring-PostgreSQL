package com.example.demo.Controllers;

import com.example.demo.Employees.Employee;
import com.example.demo.Employees.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Employees")
public class EmployeeController
{
    @Autowired
    private EmployeeRepository repository;
    @GetMapping
    public List<Employee> getAll()
    {
        List<Employee> employeeList = repository.findAll();
        return employeeList;
    }
}
