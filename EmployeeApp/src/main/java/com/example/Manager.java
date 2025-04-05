package com.example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
}
