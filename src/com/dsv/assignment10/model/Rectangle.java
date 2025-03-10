package com.dsv.assignment10.model;

public class Rectangle extends Shape{

    public double perimeter() {
        return 2*(length+breadth);
    }

    public double area() {
        return length*breadth;
    }
}
