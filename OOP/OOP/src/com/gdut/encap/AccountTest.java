package com.gdut.encap;

import jdk.nashorn.internal.ir.CallNode;

public class AccountTest {
    public static void main(String[] args){
        Account account = new Account();
        account.setPassWords("123456");
        account.setName("Ben");
        account.setBalance(24);
        account.getAccount();
    }
}
