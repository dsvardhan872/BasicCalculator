package com.dsv.assignment2.model;
//2.Create a class named "Car" with attributes like
//make, model, and year. Implement methods to set and display these attributes for different car objects.
public class Car {
    private String make;
    private String model;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

}
