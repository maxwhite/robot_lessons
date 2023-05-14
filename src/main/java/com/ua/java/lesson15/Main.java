package com.ua.java.lesson15;

public class Main {
    public static void main(String[] args) {

        Flyable pilot = new Pilot();
        Driveable driver = new Driver();

        System.out.println("Testing pilot...");
        testPilot(pilot);
        System.out.println();
        System.out.println("Testing driver...");
        testDriver(driver);

    }

    private static void testPilot(Flyable pilot) {
        pilot.takeoff();
        pilot.descent();

    }

    private static void testDriver(Driveable driver) {
        driver.moveStraight();
        driver.moveBack();
        driver.stop();
    }
}
