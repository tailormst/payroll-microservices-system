package com.spring_project.attendance_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_project.attendance_service.entity.Attendance;
import com.spring_project.attendance_service.repository.AttendanceRepository;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository repository;

    public Attendance save(Attendance attendance) {
        return repository.save(attendance);
    }

    public Attendance getByEmployeeId(Long employeeId) {

        Attendance attendance =
                repository.findByEmployeeId(employeeId);

        System.out.println(attendance);

        return attendance;
    }
}