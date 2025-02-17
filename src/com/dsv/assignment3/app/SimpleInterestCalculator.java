package com.dsv.assignment3.app;

//3.Create a Java program to calculate the simple interest.
// Ask the user to input principal amount, interest rate, and time period.
// Calculate and display the simple interest.

import com.dsv.assignment3.model.InterestCredentials;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double interestCalculator(double a, double b, double c){
        return ((a*b*c)/100);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        InterestCredentials ic = new InterestCredentials();
        System.out.print("Enter the principal amount: ");
        ic.setpAmount(read.nextDouble());
        System.out.print("Enter the interest rate: ");
        ic.setInterestRate(read.nextDouble());
        System.out.print("Enter the time period: ");
        ic.setTimePeriod(read.nextDouble());
        System.out.println(interestCalculator(ic.getpAmount(),ic.getInterestRate(),ic.getTimePeriod()));
    }
}
