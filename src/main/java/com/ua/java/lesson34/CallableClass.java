package com.ua.java.lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableClass implements Callable {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        return random.nextInt(1, 50);
    }
}
