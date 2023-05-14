package com.ua.java.lesson11;

public class Truck  extends Car{

    public Truck() {
        this.carType = "Truck";
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}
