package com.gdut.learning.exception.trycatchexercies;

import java.util.Scanner;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Exercise02 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数数量不对");

            }
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            double ret=cal(num1,num2);
            System.out.println(ret);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("输入格式错误，请输入两个整数");
        } catch (ArithmeticException e) {
            System.out.println("分母不能为零");
        }

    }
        public static double cal(int n1, int n2) {
            return n1 / n2;
        }
}
