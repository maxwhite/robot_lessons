package com.ua.java.lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter an integer value:");
        do {
            try {
                Integer.parseInt(reader.readLine());
                break;
            } catch(Exception e) {
                System.out.println("You have entered the wrong value please try again:");
            }
        } while (true);
           System.out.println("You have entered the right value!");
    }
}
