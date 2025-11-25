package com.gdut.learning.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(Eager.age);
        Eager e1=Eager.getInstance();
        Eager e2=Eager.getInstance();
        System.out.println(e1==e2);

        System.out.println(Lazy.age);
        Lazy l1=Lazy.getInstance();
        Lazy l2=Lazy.getInstance();
        System.out.println(l1==l2);
    }
}
