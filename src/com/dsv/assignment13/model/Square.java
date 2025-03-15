package com.dsv.assignment13.model;

public class Square implements Shape{
    private double sideLength;
    public double perimeter(){
        return (sideLength*4);
    }

    public double area() {
        return (sideLength*sideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
