package com.gdut.learning.homework.o1;

/**
 * @author Sparkle
 * @version 1.0
 */
public class FrockTest {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock f1 = new Frock();
        Frock f2 = new Frock();
        System.out.println(f1.getSerialNumber());
        System.out.println(f2.getSerialNumber());
    }
}
