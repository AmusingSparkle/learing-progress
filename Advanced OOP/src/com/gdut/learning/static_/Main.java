package com.gdut.learning.static_;

/**
 * @author Sparkle
 * @version 1.0
 * 编程题目：银行账户管理系统
 * 题目要求：
 * 设计一个BankAccount类，要求包含以下功能：
 * 每个账户有实例变量：账户号码(accountNumber)、账户持有人姓名(holderName)、余额(balance)
 * 使用静态变量记录：总账户数量(totalAccounts)、所有账户的总余额(totalBalance)、银行利率(interestRate)
 * 实现静态方法：
 * getTotalAccounts(): 返回总账户数量
 * getTotalBalance(): 返回所有账户总余额
 * setInterestRate(double rate): 设置银行利率
 * calculateTotalInterest(): 计算所有账户一年的总利息
 * 实现实例方法：
 * 存款(deposit)
 * 取款(withdraw)
 * 显示账户信息(displayAccountInfo)
 * 具体要求：
 * 每次创建新账户时，总账户数量自动+1
 * 每次存款、取款操作后，总余额要相应更新
 * 利率对所有账户共享，可以通过静态方法设置
 */
public class Main {
    public static void main(String[] args) {
        BankSecret.setInterestRate(0.006);
        BankAccount ben = new BankAccount("10001", "Ben", 10000);
        BankAccount jack = new BankAccount("10002", "Jack", 5000);
        BankAccount judy = new BankAccount("10003", "Judy", 123413);
        ben.deposit();
        ben.deposit();
        jack.deposit();
        jack.withdraw();
        judy.withdraw();
        System.out.println(BankSecret.getTotalAccounts());
        System.out.println(BankSecret.getTotalBalance());
        BankSecret.calculateTotalInterest();
    }
}
