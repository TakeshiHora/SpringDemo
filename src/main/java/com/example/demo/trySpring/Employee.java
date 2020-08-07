package com.example.demo.trySpring;

import lombok.Data;

@Data
public class Employee {

    private int employeeId;
    private String employeeName;
    private int age;
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public int getAge() {
        return age;
    }
}
