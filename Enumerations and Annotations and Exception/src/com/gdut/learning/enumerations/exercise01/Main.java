package com.gdut.learning.enumerations.exercise01;

/**
 * @author Sparkle
 * @version 1.0
 * 枚举练习
 */
public class Main {
    public static void main(String[] args) {
        Week week = Week.MONDAY;
        Week test =Week.THURSDAY;

        Week[] arr=week.values();
        for(Week e:arr){
            System.out.println(e);
        }

        System.out.println("========展示名字=========");
        System.out.println(week.name());

        System.out.println("=========展示编号========");
        System.out.println(week.ordinal());

        System.out.println("==========将字符串转换为枚举对象===========");
        Week week1=Week.valueOf("FRIDAY");
        System.out.println(week1);

        System.out.println("===========对比两个枚举对象================");
        System.out.println(week.compareTo(test));
    }
}
