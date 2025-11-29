package com.gdut.learning.innnerclass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class InnerClassExercise {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alarmClock(new Bell(){
            @Override
            public void bell(String str) {
                System.out.print(str);
            }
        });
    }
}

interface Bell{
    public void bell(String str);
}

class Phone{
    public void alarmClock(Bell bell){
        System.out.println("该起床了。。。");
        new Phone(){
            public void alarm(){
                System.out.println("该上课了。。。");
            }
        }.alarm();
    }
}
