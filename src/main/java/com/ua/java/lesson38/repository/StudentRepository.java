package com.ua.java.lesson38.repository;

import com.ua.java.lesson38.model.Student;

public interface StudentRepository {

    void save(Student student);

    Student getStudent(int id);

}
