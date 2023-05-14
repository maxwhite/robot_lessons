package com.ua.java.lesson34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>();
        Callable<Integer> callable = new CallableClass();
        for(int i=0; i<100; i++) {
            Future <Integer> future = executor.submit(callable);
            list.add(future);
        }

        for(Future<Integer> fut: list) {
            try {
                System.out.println(fut.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
    }
}
