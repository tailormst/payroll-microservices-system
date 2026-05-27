package com.spring_project.payslip_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring_project.payslip_service.dto.PayslipResponse;
import com.spring_project.payslip_service.service.PayslipService;

@RestController
@RequestMapping("/payslip")
@CrossOrigin("*")
public class PayslipController {

    @Autowired
    private PayslipService service;

    @GetMapping("/{employeeId}")
    public PayslipResponse getPayslip(@PathVariable Long employeeId) {
        return service.generatePayslip(employeeId);
    }
}