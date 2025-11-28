package com.gdut.learning.static_;

import java.util.Scanner;

/**
 * @author Sparkle
 * @version 1.0
 */
public class BankAccount {
    Scanner in=new Scanner(System.in);
    private String accountNumber;
    private String holderName;
    private double balance;

    public  void deposit(){
        double input;
        while(true){
            System.out.println("请输入要存入的钱：");
            input = in.nextDouble();
            if(input<=0){
                System.out.println("输入失败。。。请重新输入：");
            }
            break;
        }
        balance+=input;
        BankSecret.totalBalance+=balance;
    }
    public  void withdraw(){
        double output;
        while(true){
            System.out.println("请输入要取出的钱：");
            output = in.nextDouble();
            if(output<=0||output>balance){
                System.out.println("输入失败。。。请重新输入：");
            }
            break;
        }
        balance-=output;
        BankSecret.totalBalance-=output;
    }

    public  String displayAccountInfo(){
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        BankSecret.totalAccounts++;
    }
}
