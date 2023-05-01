package com.ua.java.lesson32;

public class Main {
    public static void main(String[] args) {
         ThreadClass1 threadObj1 = new ThreadClass1();
         ThreadClass2 threadObj2 = new ThreadClass2();

         Thread thread1 = new Thread(threadObj1);
         Thread thread2 = new Thread(threadObj2);
         thread1.start();
         thread2.start();
    }
}
