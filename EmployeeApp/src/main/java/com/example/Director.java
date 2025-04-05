package com.example;

public class Director extends Employee {
    private String department;

    public Director(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
