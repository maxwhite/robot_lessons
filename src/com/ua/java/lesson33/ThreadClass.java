package com.ua.java.lesson33;

import java.util.Random;

public class ThreadClass implements Runnable{
    @Override
    public void run() {

        do
        {
          Random random = new Random();
          int number = random.nextInt(0,10);

          System.out.println(number);

          if(number == 5) {
              Thread.currentThread().interrupt();
          }

          if(Thread.currentThread().isInterrupted()) {
              break;
          }

        } while (true);

    }
}
