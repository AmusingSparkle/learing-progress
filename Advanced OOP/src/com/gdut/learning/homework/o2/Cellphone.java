package com.gdut.learning.homework.o2;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Cellphone {
    public void testWork(){
        Calculator cal=new Calculator() {
            @Override
            public void work() {
                System.out.println("work方法被调用");
            }
        };
        cal.work();
    }

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork();
    }
}
