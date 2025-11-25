package com.gdut.learning.singleton;

public class Eager {
    public static int age=100;
    private static Eager e=new Eager();
    {
        System.out.println("普通代码块被初始化。。。");
    }
    private Eager(){
        System.out.println("饿汉式构造器被调用。。。");
    }
    public static Eager getInstance(){
        return e;
    }
}
