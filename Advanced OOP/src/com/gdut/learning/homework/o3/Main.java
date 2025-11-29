package com.gdut.learning.homework.o3;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Person ts = new Person("唐僧", VehicleFactory.gethorse());
        ts.common();
        ts.passRiver();
        ts.common();
        ts.common();
        ts.passFireMountain();
    }
    /*这道题做了很久，也产生了很多疑惑，在最开始的设想中，我就想用if语句来实现，这就是典型的面向过程编程
    但答案提醒了我，现在学的是面向对象编程，一切的代码都可以通过类和方法来完成，将交通工具集合成一个类，将
    遇到的情况有封装成一个类，以此来实现不同情况调用不同对象，总之感悟良多，无法用语言形容，还需进一步练习。
     */
}
