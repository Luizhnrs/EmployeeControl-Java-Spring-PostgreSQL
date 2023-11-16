package com.example.demo.Employees;

import jakarta.persistence.*;

@Table(name = "Employees")
@Entity(name = "Employees")
public class Employee
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String photo;
    private Integer Remuneration;
}
