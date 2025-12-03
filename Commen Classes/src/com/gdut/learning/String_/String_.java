package com.gdut.learning.String_;

import java.util.Scanner;

/**
 * @author Sparkle
 * @version 1.0
 */
public class String_ {
    public static void main(String[] args) {
        int arr[]={0x4E2D, 0x6587, 0x20, 0x7F16, 0x7801};
        String str1=new String(arr,0,5);
        System.out.println(str1);

        String a="abc";
        String b="def";
        String c=a+b;
        System.out.println(c);

        String str2=" abcdaksdfjlak sabcadabc ";
        System.out.println(str2.indexOf("abc"));
        System.out.println(str2.lastIndexOf("abc"));
        System.out.println(str2.substring(19,20));
        System.out.println(str2.trim());
        System.out.println(str1.concat(a).concat(b));
        String strArr[]=str2.split(" ");
        for(String e:strArr){
            System.out.println(e);
        }


        String s1="abc";
        String s2="abc";
        String s3="abcaads";
        System.out.println(s1.compareTo(s3));

        char charArr[] = s1.toCharArray();
        for (char e:charArr){
            System.out.println(e);
        }
        System.out.println(String.format("%s,%s",s1,str1));
        Scanner in = new Scanner(System.in);
        String str3= String.format(in.next(), "%d %d");
        System.out.println(str3);
    }
}
