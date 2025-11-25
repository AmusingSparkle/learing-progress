package com.gdut.learning.abstract_;

public class Manger extends Employee{
    private double bonus;

    public Manger(String name, String id, double sal, double bonus) {
        super(name, id, sal);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println(getName()+"正在工作");
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonus=" + bonus +
                '}';
    }
}
