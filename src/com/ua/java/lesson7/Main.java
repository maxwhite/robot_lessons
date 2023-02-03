package com.ua.java.lesson7;

public class Main {
    public static void main(String[] args) {
        System.out.println(pow3(2));
        printStars(1);
        printCharacter(3, '+');
    }

    static int pow3(int number) {
        return number * number * number;
    }

    static void printStars(int count) {
        for(int i =0; i < count; i++ ) {
            System.out.print("*");
        }
    }

    static void printCharacter(int count, char ch) {

        for(int i=0; i < count; i++) {
            System.out.print(ch);
        }
    }
}
