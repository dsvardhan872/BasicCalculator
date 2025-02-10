package com.dsv.assignment2.app;

import com.dsv.assignment2.model.Car;

public class CarInfo {
    public static void main(String[] args) {
        Car carInfo = new Car();
        carInfo.setMake("Iron");
        carInfo.setModel("Toyoto");
        carInfo.setYear(2025);

        System.out.println(
                "Car making material : "+ carInfo.getMake() +"\n"+
                        "car model : " +carInfo.getModel() +"\n"+
                        "car launched year : "+ carInfo.getYear()
        );
    }
}
