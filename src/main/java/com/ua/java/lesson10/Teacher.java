package com.ua.java.lesson10;

import java.util.Arrays;

public class Teacher {

    private String firstName;

    private String lastName;

    private String course;

    private int age;

    private int id;

    private int [] students;

    private int studentsCount;

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int[] getStudents() {
        return students;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudents(int[] students) {
        this.students = students;
    }

    public Teacher(String firstName, String lastName, String course, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.age = age;
        this.id = id;
        this.students = new int[200];
        this.studentsCount = 0;
    }

    public boolean isStudentBelongsToTeacher(int id) {

        for(int value: this.getStudents()) {
            if( value == id) {
                return true;
            }
        }

        return false;
    }

    public void addStudent(int id) {
        var students = this.getStudents();

        if(this.studentsCount < students.length) {
            students[this.studentsCount] = id;
        } else {
            throw new RuntimeException("Can't handle more students");
        }
    }

    public void removeStudent(int id) {
        var students = this.getStudents();

        for(int i = 0; i < students.length; i++) {
            if(students[i] == id) {
               students[i] = 0;
               break;
            }
        }
    }

}
