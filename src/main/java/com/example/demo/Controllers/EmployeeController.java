package com.example.demo.Controllers;

import com.example.demo.Employees.Employee;
import com.example.demo.Employees.EmployeeRepository;
import com.example.demo.Employees.EmployeeRequestDTO;
import com.example.demo.Employees.EmployeeResponseDTO;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Employees")
public class EmployeeController
{
    @Autowired
    private EmployeeRepository repository;
    @PostMapping
    public EmployeeResponseDTO saveEmployee(@RequestBody EmployeeRequestDTO data){
        Employee employeeData = new Employee(data);
        Employee savedEmployee = repository.save(employeeData);
        return new EmployeeResponseDTO(savedEmployee);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<EmployeeResponseDTO> getAll()
    {
        List<EmployeeResponseDTO> employeeList = repository.findAll().stream().map(EmployeeResponseDTO::new).toList();
        return employeeList;
    }
}
