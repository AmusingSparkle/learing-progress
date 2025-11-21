package com.gdut.homework.homework02;

public class Main {
    public static void main(String[] args) {
        OrdinaryWorker ben = new OrdinaryWorker("Ben", 300, 230);
        Manager simith = new Manager("Simith", 700, 180);
        ben.press();
        System.out.println("\n");
        simith.press();
    }
}
