package com.gdut.homework.homework02;

import java.util.concurrent.SynchronousQueue;

public class OrdinaryWorker extends Worker{
    double grade=1.0;

    public OrdinaryWorker(String name, int sal, int day) {
        super(name, sal, day);
    }
    public double salSum(){
        return getSal()*getDay()*grade;
    }
    public void press(){
        System.out.printf(getName()+"你的工资是："+salSum());
    }
}
