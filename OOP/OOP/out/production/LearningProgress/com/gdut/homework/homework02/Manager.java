package com.gdut.homework.homework02;

public class Manager extends Worker{
    double grade=1.2;
    public double salSum(){
        return 1000+getSal()*getDay()*grade;
    }

    public void press(){
        System.out.printf(getName()+"你的工资是："+salSum());
    }

    public Manager(String name, int sal, int day) {
        super(name, sal, day);
    }
}
