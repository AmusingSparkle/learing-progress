package com.gdut.learning.homework.o3;

/**
 * @author Sparkle
 * @version 1.0
 */
public class VehicleFactory {
    private static Horse horse=new Horse();
    private VehicleFactory(){};
    public static Boat getBoat(){
        return new Boat();
    }
    public static Horse gethorse(){
        return horse;
    }
    public static Plane gerPlane(){
        return new Plane();
    }
}
