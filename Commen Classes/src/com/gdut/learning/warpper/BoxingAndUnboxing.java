package com.gdut.learning.warpper;

/**
 * @author Sparkle
 * @version 1.0
 */
public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //手动装箱
        int n1=10;
        Integer i1=new Integer(n1);
        Integer i2=Integer.valueOf(n1);
        //手动拆箱
        int n2 = i1.intValue();
        System.out.println(n2);
        //自动装箱
        int n3=20;
        Integer i3=n3;//直接让一个对象等于普通数据类型
        //自动拆箱
        n3 =i3;//直接让一个普通数据类型等于对象
        System.out.println(n3);



        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);

        Integer a1=100;
        Integer a2=100;
        System.out.println(a1==a2);

        Integer a3=128;//默认调用valueOf
        Integer a4=128;//valueOf源码中
        System.out.println(a3==a4);

        int b1=200;
        Integer b2=200;
        System.out.println(b1==b2);


    }
}
