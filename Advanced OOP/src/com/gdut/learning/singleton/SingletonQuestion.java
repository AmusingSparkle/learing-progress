package com.gdut.learning.singleton;

public class SingletonQuestion {
    public static int age=100;
    {
        System.out.println("普通代码块被调用。。。");
    }
    static {
        System.out.println("静态代码块被调用。。。");
    }
    public void test(){
        System.out.println("普通方法被调用。。。");
    }
    public static void testStatic(){
        System.out.println("静态方法被调用");
    }
    public SingletonQuestion(){
        System.out.println("构造器被调用。。。");
    }

    public static void main(String[] args) {
        System.out.println(SingletonQuestion.age);
    }
}
