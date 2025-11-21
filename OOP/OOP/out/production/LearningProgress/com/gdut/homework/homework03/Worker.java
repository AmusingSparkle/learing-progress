package com.gdut.homework.homework03;

public class Worker extends Employee{
    public Worker(int sal) {
        super(sal);
    }
    public void pressSal(){
        System.out.println("你的工资是"+getSal());
    }
}
