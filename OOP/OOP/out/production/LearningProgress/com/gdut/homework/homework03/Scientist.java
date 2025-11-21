package com.gdut.homework.homework03;

public class Scientist extends Employee{
    double bonus;

    public void pressSal(){
        System.out.println("你的工资是"+(getSal()+bonus));
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Scientist(int sal, double bonus) {
        super(sal);
        this.bonus = bonus;
    }
}
