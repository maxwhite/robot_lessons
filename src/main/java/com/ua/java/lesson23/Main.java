package com.ua.java.lesson23;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Max", "Max","Max", "John", "John","John", "Marry", "Marry","Marry","Marry", "Bob","Bob","Bob", "Markus", "Markus", "Markus", "Endy", "Sarah","Sarah","Sarah");

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        List<Integer> arrayList = new LinkedList<>();

        Random rand = new Random();

        for(int i=0; i< 10; i++) {
            arrayList.add(rand.nextInt(0,100));
        }

        int sum  = arrayList.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);

    }

}
