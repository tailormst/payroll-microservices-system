package com.spring_project.employee_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_project.employee_service.entity.Employee;
import com.spring_project.employee_service.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee getById(Long id) {

        Employee employee =
                repository.findById(id).orElse(null);

        System.out.println(employee);

        return employee;
    }
}