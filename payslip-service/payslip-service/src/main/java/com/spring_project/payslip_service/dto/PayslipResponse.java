package com.spring_project.payslip_service.dto;

public class PayslipResponse {

    private String employeeName;

    private double basicSalary;

    private int presentDays;

    private double finalSalary;

    public PayslipResponse() {
    }

    public PayslipResponse(
            String employeeName,
            double basicSalary,
            int presentDays,
            double finalSalary) {

        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.presentDays = presentDays;
        this.finalSalary = finalSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setPresentDays(int presentDays) {
        this.presentDays = presentDays;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }
}