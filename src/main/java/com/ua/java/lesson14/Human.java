package com.ua.java.lesson14;

public abstract class Human {

    protected int age;

    protected String sex;

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setSex(String sex) {
        if(!sex.equals("male") && !sex.equals("female")) {
            throw new RuntimeException("Sex have to be male or female");
        }
        this.sex = sex;
    }

    protected int getAge() {
        return this.age;
    }

    protected String getSex() {
        return this.sex;
    }
}
