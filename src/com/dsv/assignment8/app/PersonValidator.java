package com.dsv.assignment8.app;

import com.dsv.assignment8.model.Person;

import java.util.Scanner;

//8.Construct a class representing a "Person" with private attributes like name, age, and ID.
// Implement public methods to access and modify these attributes in a controlled manner.
public class PersonValidator {
    public static void main(String[] args) {
        Person p1 = new Person();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the person name: ");
        p1.setName(read.next());

        System.out.println("Enter the person age");
        p1.setAge(read.nextInt());

        System.out.println("Enter the person id");
        p1.setId(read.nextInt());

        System.out.println("Name: "+p1.getName()+"\nAge: "+p1.getAge()+"\nId: "+p1.getId());

    }
}
