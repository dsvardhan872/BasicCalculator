package com.dsv.assignment13.model;

public class Triangle implements Shape{
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    public double area() {
        return (1/2*base*height);
    }

    public double perimeter() {
        return (sideA+sideB+base);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
