package com.ua.java.lesson14;

public class Student extends Human{

    private int year;

    private String course;

    public Student() {

    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getCourse() {
        return course;
    }
}
