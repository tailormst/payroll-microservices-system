package com.spring_project.attendance_service.entity;

import jakarta.persistence.*;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Long getEmployeeId() {
        return employeeId;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setPresentDays(int presentDays) {
        this.presentDays = presentDays;
    }
}