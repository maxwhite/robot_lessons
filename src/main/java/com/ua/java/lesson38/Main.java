package com.ua.java.lesson38;

import com.ua.java.lesson38.model.Student;
import com.ua.java.lesson38.repository.StudentMysqlRepository;

public class Main {


    public static void main(String[] args) {

        Student student = Student.
                builder().
                age(20).
                id(1).
                course("math-134").
                firstName("John").lastName("Doe").build();

        StudentMysqlRepository repo = new StudentMysqlRepository();

        repo.save(student);

        Student storedStudent = repo.getStudent(1);

        System.out.println(storedStudent.getLastName());
    }

}
