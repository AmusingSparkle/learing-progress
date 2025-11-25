package com.gdut.learning.singleton;

public class Lazy {
    private static Lazy l;
    public static int age=200;
    private Lazy() {
        System.out.println("懒汉式构造器被调用。。。");
    }
    public static Lazy getInstance(){
        if(l==null){
            l=new Lazy();
        }
        return  l;
    }
}
