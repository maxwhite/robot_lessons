package com.ua.java.lesson26;

public class Main {
    public static void main(String[] args) throws LessThanZeroException {
        squareNumber(-3);
    }

    private static int squareNumber(int number) throws LessThanZeroException {
        if(number < 0) {
            throw new LessThanZeroException();
        }
        return number * number;
    }
}
