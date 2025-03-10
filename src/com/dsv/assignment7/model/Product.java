package com.dsv.assignment7.model;

public class Product {
    private String name;
    private int price;
    private int quantity;


    public Product(String name) {
        this.name = name;
    }
    public Product(){

    }
    public Product(int price,int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }


}
