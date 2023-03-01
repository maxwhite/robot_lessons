package com.ua.java.lesson14;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        teacher.setCourse("Math-133-0001");
        teacher.setAge(42);
        teacher.setSex("male");

        System.out.println("Teacher sex: " + teacher.getSex());
        System.out.println("Teacher age: " + teacher.getAge());
        System.out.println("Teacher course: " + teacher.getCourse());

        Student student = new Student();

        student.setAge(20);
        student.setSex("male");
        student.setCourse("Physics-1343-0001");
        
        System.out.println();
        System.out.println("Student sex: " + student.getSex());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student course: " + student.getCourse());


    }
}
