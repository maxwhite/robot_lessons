package com.ua.java.lesson10;

public class Student {

    private String firstName;

    private String lastName;

    private int age;

    private String course;

    private int id;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public Student(String firstName, String lastName, int age, String course, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.id = id;
    }

    public void showStudentsData() {

        System.out.println("Student id: " + this.getId() + "\n" +
                           "First name: " + this.getFirstName() + "\n" +
                           "Last name: "  + this.getLastName() + "\n" +
                           "Age: "        + this.getAge() + "\n" +
                           "Course: "     + this.getCourse());

    }

    public void changeCourse(String newCourse) {
        this.setCourse(newCourse);
    }
}
