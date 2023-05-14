package com.ua.java.lesson6;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 to 10 sequence");
        for(int i=1; i<11; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        System.out.println("1 to 100 even numbers sequence");
        for(int i=1; i<101; i++) {
            if( i % 2 == 0 ) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        System.out.println("Factorial of 7");
        int fact = 1;
        for(int i=1; i<8; i++ ) {
            fact *= i;
        }
        System.out.println(fact);


        System.out.println("Fibonacci sequence");
        int prev = 0;
        int next = 1;

        while(next < 100 ) {

            System.out.print( prev + "," + next + ",");
            prev = prev + next;
            next = prev + next;

        }

    }
}
