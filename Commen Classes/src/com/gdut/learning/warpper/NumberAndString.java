package com.gdut.learning.warpper;

/**
 * @author Sparkle
 * @version 1.0
 */
public class NumberAndString {
    public static void main(String[] args) {
        Integer i=100;
        String str1=i.toString();
        String str2=i+"";
        String str3=String.valueOf(i);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String str="100000";
        int i1=Integer.parseInt(str);
        int i2=Integer.valueOf(str);
        System.out.println(i1++);
        System.out.println(++i2);
    }
}
