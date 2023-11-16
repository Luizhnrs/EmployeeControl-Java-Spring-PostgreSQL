package com.example.demo.Employees;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "Employees")
@Entity(name = "Employees")
public class Employee
{
    private Long id;
    private String name;
    private String photo;
    private Integer Remuneration;
}
