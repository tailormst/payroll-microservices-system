package com.spring_project.payslip_service.dto;

public class Employee {

    private Long id;
    private String name;
    private double basicSalary;
    private String department;

    public Employee() {
    }

    public Employee(Long id, String name, double basicSalary, String department) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}