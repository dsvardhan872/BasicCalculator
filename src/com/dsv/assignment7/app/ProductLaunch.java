package com.dsv.assignment7.app;
//7.Create a class "Product" with attributes like name, price, and quantity.
// Implement multiple constructors to initialize objects with different sets of parameters.

import com.dsv.assignment7.model.Product;

import java.util.Scanner;

public class ProductLaunch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the product name, price,quantity in order");
        Product p1 = new Product(read.next(),read.nextInt(),read.nextInt());
        System.out.println("Product : "+p1.getName()+"\n Price : "+p1.getPrice()+"\n Quantity : "+p1.getQuantity());

        System.out.println("Enter the product name, price,quantity in order");
        Product p2 = new Product(read.next(),read.nextInt(),read.nextInt());
        System.out.println("Product : "+p2.getName()+"\n Price : "+p2.getPrice()+"\n Quantity : "+p2.getQuantity());
    }
}
