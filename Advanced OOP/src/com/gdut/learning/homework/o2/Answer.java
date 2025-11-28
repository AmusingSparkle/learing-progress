package com.gdut.learning.homework.o2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Answer {
    public static void main(String[] args) {
        aCellphone aCellphone = new aCellphone();
        aCellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },80,90);
        aCellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },90,30);
    }
}
interface ICalculate{
    public double work(double n1,double n2);
}
class aCellphone{
    public void testWork(ICalculate calculate,double n1,double n2){
        double result=calculate.work(n1,n2);
        class test implements ICalculate{
            class testInner {
                public void sout(){
                    System.out.println("内部类内部类被调用，结果为"+n1/n2);
                }
            }
            @Override
            public double work(double n1, double n2) {
                return n1-n2;
            }
            public void print(){
                testInner testInner = new testInner();
                testInner.sout();
                System.out.println(work(n1,n2));
            }
        }
        test test = new test();
        test.print();
        System.out.println("结果为："+result);
    }
}
