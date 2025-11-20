package com.gdut.wallet;

import jdk.nashorn.internal.ir.CallNode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class WalletFuction {
    //变量集
    private int menuChoose;//功能选择
    private boolean exit=true;//退出选择
    private String print="-------------账户明细--------------";
    private double earning;//入账
    private double balance;//余额
    private double cost;//支出
    private String address;//支出地点
    Date date=null;
    SimpleDateFormat spd=new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Scanner in = new Scanner(System.in);

    public void walletMenu(){
        do {
            System.out.print("=============零钱通============\n" +
                    "\t\t\t1.明\t细\n" +
                    "\t\t\t2.入\t账\n" +
                    "\t\t\t3.支\t出\n" +
                    "\t\t\t4.退\t出\n" +
                    "请选择功能（1~4）：");
            menuChoose = in.nextInt();
            switch (menuChoose){
                case 1:{
                    this.detail();
                    break;
                }
                case 2:{
                    this.income();
                    break;
                }
                case 3:{
                    this.outcome();
                    break;
                }
                case 4:{
                    System.out.println("已退出程序...");
                    exit=false;
                    break;
                }
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }while(exit);
    }

    public void detail(){
        System.out.println(print);
    }

    public void income(){
        while(true){
            System.out.print("请输入收入数额：");
            earning= in.nextDouble();
            if(earning>0)
                break;
            System.out.println("输入值必须大于零，请重新输入...");
        }
        balance+=earning;
        date=new Date();
        print=print+"\n入账+"+earning+" "+spd.format(date)+"\t"+balance;
    }

    public void outcome(){
        System.out.println("请输入支出用途或地点：");
        address=in.next();
        while(true){
            System.out.println("请输入支出数额:");
            cost=in.nextDouble();
            if(cost>0&&cost<=balance)
                break;
            System.out.println("支出不合法，请重新输入：");
        }
        balance-=cost;
        date=new Date();
        print=print+"\n"+address+"\t-"+cost+"\t"+spd.format(date)+"\t"+balance;
    }
}
