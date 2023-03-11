package com.ua.java.lesson17;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDayOfTheWeek(2));
    }

    private static String getDayOfTheWeek(int number) {
        for (Days day: Days.values()) {
            if(day.number == number) {
                return day.name;
            }
        }

        throw new RuntimeException("Wrong day number has been provided: " + number);
    }

}
