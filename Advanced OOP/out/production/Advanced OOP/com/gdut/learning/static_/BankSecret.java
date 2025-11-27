package com.gdut.learning.static_;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

/**
 * @author Sparkle
 * @version 1.0
 */
public class BankSecret {
    Scanner in = new Scanner(System.in);
    public static int totalAccounts;
    public static int totalBalance;
    private static double interestRate;

    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public static int getTotalBalance(){
        return totalBalance;
    }
    public static void setInterestRate(double rate){
        BankSecret.interestRate=rate;
    }
    public  static double calculateTotalInterest(){
        return BankSecret.totalBalance*interestRate;
    }
}
