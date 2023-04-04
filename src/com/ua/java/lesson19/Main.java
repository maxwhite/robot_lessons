package com.ua.java.lesson19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i < 1000; i++) {

            int value = random.nextInt(1, 51);
            hashSet.add(value);
            linkedHashSet.add(value);
            treeSet.add(value);

        }

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
