package com.dsv.assignment10.model;

public class Circle extends Shape{
    public double perimeter(){
        return (2* 22/7 *radius);
    }
    public double area(){
        return (22/7 * radius*radius);
    }
}
