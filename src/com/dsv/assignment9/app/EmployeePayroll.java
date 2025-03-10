package com.dsv.assignment9.app;

import com.dsv.assignment9.model.Employee;

import java.util.Scanner;

//9.Develop a Java program that calculates the payroll for employees based on hours worked
// and hourly rates. Incorporate different pay rates for regular hours and overtime.
public class EmployeePayroll {
    static final private int salarypH = 10000;
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the employee name, hours worked, overTime hours:");
        e1.setName(read.nextLine());
        e1.setHourWorked(read.nextInt());
        e1.setOverTime(read.nextInt());

        System.out.println("Payout of the "+e1.getName()+": "+(e1.getHourWorked()*salarypH + e1.getOverTime()*salarypH));
    }
}
