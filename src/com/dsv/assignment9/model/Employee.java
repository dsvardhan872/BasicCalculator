package com.dsv.assignment9.model;

public class Employee {
    private String name;
    private int hourWorked;
    private int overTime;

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
