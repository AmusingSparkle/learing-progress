package com.gdut.learning.homework;

import java.util.Scanner;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Color[] arr=Color.values();
        System.out.println("请输入要查看的颜色的序号：");
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        switch (i){
            case 0: {
                arr[0].showDetail();
                break;
            }
            case 1:{
                arr[1].showDetail();
                break;
            }
            case 2:{
                arr[2].showDetail();
                break;
            } case 3:{
                arr[3].showDetail();
                break;
            } case 4:{
                arr[4].showDetail();
                break;
            } default:{
                System.out.println("输入不正确...");
            }
        }
    }
}
