package com.ua.java.lesson15;

public class Pilot extends Human implements Flyable{


    @Override
    public void descent() {
        System.out.println("Start descent");
    }

    @Override
    public void takeoff() {
        System.out.println("Start takeoff");
    }
}
