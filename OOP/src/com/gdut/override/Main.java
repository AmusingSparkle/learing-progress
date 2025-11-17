package com.gdut.override;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("张三", 18);
        Student p2 = new Student("小明", 8, 123456, 98);
        p1.say();
        p2.say();
    }
}
