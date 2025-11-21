package com.gdut.homework.homework02;

public class Worker {
    private String name;
    private int sal;
    private int day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Worker(String name, int sal, int day) {
        this.name = name;
        this.sal = sal;
        this.day = day;
    }
}
