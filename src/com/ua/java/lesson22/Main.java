package com.ua.java.lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Max");
        student.setScore(100);

        Student student1 = new Student();
        student1.setName("John");
        student1.setScore(99);

        Student student2 = new Student();
        student2.setName("Adam");
        student2.setScore(85);

        Student student3 = new Student();
        student3.setName("Bob");
        student3.setScore(75);

        Student student4 = new Student();
        student4.setName("Dan");
        student4.setScore(80);

        List<Student> students = new ArrayList<>();

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.sort((Student s1, Student s2) -> s1.getScore() - s2.getScore());
        students.sort(Comparator.comparingInt(Student::getScore));

        System.out.println(students);

        students.sort((Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
        students.sort(Comparator.comparing(Student::getName));

        System.out.println(students);

    }
}
