package com.gdut.learning.finalexercise;

public class S {
    private double r=0;
    private final double PI=3.14;

    public S(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double cal(double r){
        setR(r);
        return getR()*getR()*PI;
    }

    public static void main(String[] args) {
        S s = new S(3.0);
        System.out.println(s.cal(4.0));
    }
}
