package com.ua.java.lesson15;

public abstract class Human {

    protected int age;

    protected String sex;

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
