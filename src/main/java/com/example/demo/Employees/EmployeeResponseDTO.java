package com.example.demo.Employees;

import org.hibernate.tool.schema.spi.SchemaTruncator;

public record EmployeeResponseDTO (long id, String name, String photo, Integer remuneration) {
    public EmployeeResponseDTO (Employee employee){
        this(employee.getId(), employee.getName(), employee.getPhoto(), employee.getRemuneration());
    }
}
