package com.ua.java.lesson18;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        java.util.List<Integer> list = new LinkedList<Integer>();

        for(int i=0; i< 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        java.util.List<Integer> arrayListIntegers = new java.util.ArrayList<>();

        for(int i = 0; i< 1000_000; i++) {
            arrayListIntegers.add(i);
        }

        java.util.List<Student> students = new java.util.ArrayList<>();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();


        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);


        List<Integer> arrayList = new ArrayList();

        for(int i=1; i<11; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList); // [1,2,3,4,5,6,7,8,9,10]
        System.out.println(arrayList.size()); // 10

        arrayList.remove(0);
        System.out.println(arrayList); // [2,3,4,5,6,7,8,9,10]

        arrayList.remove(Integer.valueOf(5));
        System.out.println(arrayList); // [2,3,4,6,7,8,9,10]

        arrayList.add(2, 100);
        System.out.println(arrayList); // [2,3,100,4,6,7,8,9,10]

        int value = arrayList.get(2);
        System.out.println(value); // 100

        int index = arrayList.indexOf(100);
        System.out.println(index); // 2

        System.out.println(arrayList.isEmpty()); // false

        arrayList.clear();
        System.out.println(arrayList.isEmpty()); // true
        System.out.println(arrayList.size()); // 0
        System.out.println(arrayList); // []

        List <String> arrayListStr = new ArrayList<>();

        arrayListStr.add("one");
        arrayListStr.add("two");
        arrayListStr.add("one");
        arrayListStr.add("three");
        arrayListStr.add("four");
        arrayListStr.add("five");

        System.out.println(arrayListStr); // [one,two,one,three,four,five]

        arrayListStr.add(2, "test");
        System.out.println(arrayListStr); // [one,two,test,one,three,four,five]
        int indexOf = arrayListStr.indexOf("five");
        System.out.println(indexOf); // 6
    }

}
