package com.infy.model;

public class Employee {
    private Integer employeeId;
    String name;
    public Integer getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public Employee(Integer employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    } 
}
