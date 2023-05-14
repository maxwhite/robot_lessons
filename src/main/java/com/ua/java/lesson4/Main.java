package com.ua.java.lesson4;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, World";
        String str_with_quotes = "\"" + str + "\"";
        
        System.out.println(str_with_quotes + " toUpperCase() -> " + str.toUpperCase());
        System.out.println(str_with_quotes + " toLowerCase() -> " + str.toLowerCase());
        System.out.println("a first letter in " + str_with_quotes + " is " + str.charAt(0));
        System.out.println("a last letter in "  + str_with_quotes + " is " + str.charAt(str.length() - 1));
    }
}
