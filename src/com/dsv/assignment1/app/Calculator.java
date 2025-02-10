package com.dsv.assignment1.app;

//1.Create a Java program that functions as a basic calculator. It should take two numbers and perform operations
// like addition, subtraction, multiplication, and division based on user input.

import com.dsv.assignment1.model.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n1,n2;
        int option;
        System.out.println("Enter the two numbers");
        n1 = read.nextDouble();
        n2 = read.nextDouble();

        Numbers numObj = new Numbers();
        numObj.setNum1(n1);
        numObj.setNum2(n2);

        System.out.println("choose the operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        option = read.nextInt();
        switch (option){
            case 1 :
                Addition addObj = new Addition();
                System.out.println(addObj.add(numObj.getNum1(), numObj.getNum2()));
                break;
            case 2:
                Subtraction subObj = new Subtraction();
                System.out.println(subObj.subtract(numObj.getNum1(),numObj.getNum2()));
                break;
            case 3:
                Multiplication mulObj = new Multiplication();
                System.out.println(mulObj.multiply(numObj.getNum1(), numObj.getNum2()));
                break;
            case 4:
                Division divObj = new Division();
                System.out.println(divObj.div(numObj.getNum1(), numObj.getNum2()));
                break;
            default:
                System.out.println("Sorry! This calculator is limited to this area only");
        }
    }
}
