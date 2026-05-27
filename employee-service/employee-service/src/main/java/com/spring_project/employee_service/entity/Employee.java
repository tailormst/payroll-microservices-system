package com.spring_project.employee_service.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double basicSalary;

    private String department;

    public Employee() {
    }

    public Employee(Long id, String name,
                    double basicSalary,
                    String department) {

        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}