package com.gdut.homework.homework03;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(60000);
        Teacher teacher = new Teacher(72000, 200, 13);
        Scientist scientist = new Scientist(1500000, 300000);
        worker.pressSal();
        teacher.pressSal();
        scientist.pressSal();
    }
}
