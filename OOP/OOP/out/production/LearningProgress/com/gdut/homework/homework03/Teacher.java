package com.gdut.homework.homework03;

public class Teacher extends Employee{
    int classDay;
    double classSal;

    public void pressSal(){
        System.out.println("你的工资是"+(getSal()+classSal*classDay));
    }
    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public Teacher(int sal, int classDay, double classSal) {
        super(sal);
        this.classDay = classDay;
        this.classSal = classSal;
    }
}
