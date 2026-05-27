package com.spring_project.payslip_service.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import com.spring_project.payslip_service.dto.Attendance;
import com.spring_project.payslip_service.dto.Employee;
import com.spring_project.payslip_service.dto.PayslipResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

public class PayslipServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private PayslipService payslipService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGeneratePayslip() {

        Employee employee = new Employee(
                1L,
                "Mohammed",
                30000,
                "IT"
        );

        Attendance attendance = new Attendance(
                1L,
                1L,
                26
        );

        when(restTemplate.getForObject(
                anyString(),
                org.mockito.ArgumentMatchers.eq(Employee.class)))
                .thenReturn(employee);

        when(restTemplate.getForObject(
                anyString(),
                org.mockito.ArgumentMatchers.eq(Attendance.class)))
                .thenReturn(attendance);

        PayslipResponse response =
                payslipService.generatePayslip(1L);

        assertEquals(
                "Mohammed",
                response.getEmployeeName()
        );

        assertEquals(
                30000,
                response.getBasicSalary()
        );

        assertEquals(
                26,
                response.getPresentDays()
        );

        assertEquals(
                26000,
                response.getFinalSalary()
        );
    }
}