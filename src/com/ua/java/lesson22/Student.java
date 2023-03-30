package com.ua.java.lesson22;

public class Student {

    private String name;

    private int score;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return
                this.name + " : " +
                this.score;
    }

}
