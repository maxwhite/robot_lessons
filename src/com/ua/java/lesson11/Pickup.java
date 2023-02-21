package com.ua.java.lesson11;

public class Pickup extends Car {

    public Pickup() {
        this.carType = "Pickup";
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}
