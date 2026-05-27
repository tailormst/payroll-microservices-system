package com.spring_project.payslip_service.dto;

public class Attendance {

    private Long id;
    private Long employeeId;
    private int presentDays;

    public Attendance() {
    }

    public Attendance(Long id, Long employeeId, int presentDays) {
        this.id = id;
        this.employeeId = employeeId;
        this.presentDays = presentDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public void setPresentDays(int presentDays) {
        this.presentDays = presentDays;
    }
}