package com.gdut.learning.homework.o4;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature<0){
                System.out.println("吹暖风");
            }else if(temperature>40){
                System.out.println("吹冷风");
            }else{
                System.out.println("关空调");
            }
        }
        public Air getAir(){
            Air air = new Air();
            return air;
        }
    }

}
