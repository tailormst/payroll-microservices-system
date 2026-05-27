package com.spring_project.payslip_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring_project.payslip_service.dto.Attendance;
import com.spring_project.payslip_service.dto.Employee;
import com.spring_project.payslip_service.dto.PayslipResponse;

@Service
public class PayslipService {

    @Autowired
    private RestTemplate restTemplate;

    public PayslipResponse generatePayslip(Long employeeId) {

        Employee employee = restTemplate.getForObject(
                "http://localhost:8081/employees/" + employeeId,
                Employee.class);

        Attendance attendance = restTemplate.getForObject(
                "http://localhost:8082/attendance/" + employeeId,
                Attendance.class);

        if(employee == null) {
            throw new RuntimeException("Employee not found");
        }

        if(attendance == null) {
            throw new RuntimeException("Attendance not found");
        }

        double perDaySalary =
                employee.getBasicSalary() / 30;

        double finalSalary =
                perDaySalary * attendance.getPresentDays();

        return new PayslipResponse(
                employee.getName(),
                employee.getBasicSalary(),
                attendance.getPresentDays(),
                finalSalary
        );
    }
}