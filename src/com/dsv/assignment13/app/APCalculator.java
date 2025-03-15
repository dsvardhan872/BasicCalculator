package com.dsv.assignment13.app;

import com.dsv.assignment13.model.Square;
import com.dsv.assignment13.model.Triangle;

import java.util.Scanner;

//13.Construct an interface "Shape" with methods for area and perimeter calculation.
// Implement this interface in classes like "Square," "Triangle," etc.,
// providing specific logic for area and perimeter calculations.
public class APCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Square s = new Square();

        System.out.print("Enter the length of the square:");
        s.setSideLength(read.nextDouble());
        System.out.println("Perimeter of the square is "+s.perimeter());
        System.out.println("Area of the square is "+s.area());


        Triangle t = new Triangle();
        System.out.print("Enter the base of the triangle");
        t.setBase(read.nextDouble());
        System.out.print("Enter the height of the triangle");
        t.setHeight(read.nextDouble());
        System.out.print("Enter the sideA of the triangle");
        t.setSideA(read.nextDouble());
        System.out.print("Enter the sideB of the triangle");
        t.setSideB(read.nextDouble());

        System.out.println("The area of the triangle is "+t.area());
        System.out.println("The perimeter of the triangle is"+t.perimeter());
    }
}
