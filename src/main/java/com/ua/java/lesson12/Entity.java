package com.ua.java.lesson12;

import java.sql.Timestamp;

public class Entity {

    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Calling initialization block before each constructor time: " + timestamp.getTime());
    }

    public Entity() {
        System.out.println("Calling default constructor");
    }

    public Entity(int id) {
        System.out.println("Calling constructor with int parameter");
    }

    public Entity(String hash) {
        System.out.println("Calling constructor with String parameter");
    }

}
