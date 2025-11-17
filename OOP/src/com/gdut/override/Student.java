package com.gdut.override;

public class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }
    public void say(){
        System.out.println("我是"+getName()+"我今年"+getAge()+"岁了。"+"我的学号是："+id+"我的成绩是"+score);

    }

}
