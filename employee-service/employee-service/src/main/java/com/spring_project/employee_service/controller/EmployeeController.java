package com.spring_project.employee_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring_project.employee_service.entity.Employee;
import com.spring_project.employee_service.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {

        Employee employee = service.getById(id);

        System.out.println(employee);

        return employee;
    }
}