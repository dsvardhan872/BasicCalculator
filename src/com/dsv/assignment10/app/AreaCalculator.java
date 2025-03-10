package com.dsv.assignment10.app;

import com.dsv.assignment10.model.Circle;
import com.dsv.assignment10.model.Rectangle;
import com.dsv.assignment10.model.Shape;

import java.util.Scanner;

//10.Construct a superclass called "Shape" with methods to calculate the area and perimeter.
// Create subclasses such as "Rectangle" and "Circle" that inherit from the Shape class and
// implement their specific area and perimeter calculations.
public class AreaCalculator{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        rect.length = read.nextDouble();
        rect.breadth = read.nextDouble();
        System.out.println("Perimeter of the rectangle : "+rect.perimeter());
        System.out.println("Area of the rectangle: "+rect.area());

        Circle c = new Circle();
        c.radius = read.nextDouble();
        System.out.println("Perimeter of the circle: "+c.perimeter());
        System.out.println("Area of the circle: "+c.area());
    }
}
