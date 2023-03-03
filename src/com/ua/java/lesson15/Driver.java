package com.ua.java.lesson15;

public class Driver extends Human implements Driveable{

    @Override
    public void moveStraight() {
        System.out.println("Move straight");
    }

    @Override
    public void moveBack() {
        System.out.println("Move back");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
