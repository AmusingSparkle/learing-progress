package com.gdut.learning.exception.trycatchexercies;

import java.util.Scanner;

/**
 * @author Sparkle
 * @version 1.0
 */
public class exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num;
        while (true){
            try {
                num=Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("不是整数，请重新输入：");
            }
        }
        System.out.println(num);
    }
}
