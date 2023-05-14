package com.ua.java.lesson5;

public class Main {
    public static void main(String[] args) {
        int figure1 = 1;
        int figure2 = 14;

        System.out.println("Larger number from " + figure1 + " and " + figure2 + " is");

        if( figure1 > figure2 ) {
            System.out.println(figure1);
        } else if (figure2 > figure1) {
            System.out.println(figure2);
        } else {
            System.out.println("both numbers are equals");
        }

        System.out.println("Fewer number from " + figure1 + " and " + figure2 + " is");

        if( figure1 < figure2 ) {
            System.out.println(figure1);
        } else if (figure2 < figure1) {
            System.out.println(figure2);
        } else {
            System.out.println("both numbers are equals");
        }

        int figure3 = 12;
        System.out.println("Check if number is even");

        if(figure3 % 2 == 0) {
            System.out.println(figure3 + " is even");
        } else {
            System.out.println(figure3 + " is odd");
        }

    }
}
