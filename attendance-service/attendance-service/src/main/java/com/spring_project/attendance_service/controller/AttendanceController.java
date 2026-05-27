package com.spring_project.attendance_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring_project.attendance_service.entity.Attendance;
import com.spring_project.attendance_service.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
@CrossOrigin("*")
public class AttendanceController {

    @Autowired
    private AttendanceService service;

    @PostMapping
    public Attendance save(@RequestBody Attendance attendance) {
        return service.save(attendance);
    }

    @GetMapping("/{employeeId}")
    public Attendance getAttendance(
            @PathVariable Long employeeId) {

        return service.getByEmployeeId(employeeId);
    }
}