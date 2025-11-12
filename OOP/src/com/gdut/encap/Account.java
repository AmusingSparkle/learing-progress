package com.gdut.encap;

import java.util.Scanner;

public class Account {
    private String name;
    private int balance;
    private String passWords;

    public void setBalance(int balance) {
        if(balance>20){
            this.balance = balance;
        }
        else{
            System.out.println("余额至少20.请重新输入：");
        }
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }
        else{
            System.out.println("名字长度不正确（二到四个字），请从新输入：");
        }
    }

    public void setPassWords(String passWords){
        if(passWords.length()==6){
            this.passWords = passWords;
        }
        else{
            System.out.println("密码格式不正确，请输入六位数的密码：");
        }
    }

    public Account() {
    }

    public Account(String name, int balance, String passWords) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassWords(passWords);
    }

    private String getName() {
        return name;
    }

    private int getBalance() {
        return balance;
    }

    public void getAccount() {
        System.out.println("请输入密码：");
        Scanner in = new Scanner(System.in);
        String tryPass=in.next();
        int i=5;
        for(i=5;i>0;i--) {
            if (passWords.equals(tryPass)) {
                System.out.println(getBalance());
                System.out.println(getName());
                break;
            } else {
                System.out.println("输入错误，请重新输入,你还有"+(i-1)+"次机会");
            }
        }if(i==0){
            System.out.println("机会已经用尽，账户已封锁");
        }
    }
}