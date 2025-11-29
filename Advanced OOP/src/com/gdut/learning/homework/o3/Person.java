package com.gdut.learning.homework.o3;

import com.gdut.learning.finalexercise.S;

/**
 * @author Sparkle
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles transport;

    public Person(String name, Vehicles transport) {
        this.name = name;
        this.transport = transport;
    }

    public void common() {
        if (!(transport instanceof Horse)) {
            transport = VehicleFactory.gethorse();
        }
        transport.work();
    }

    public void passRiver() {
        if (!(transport instanceof Boat)) {
            transport = VehicleFactory.getBoat();
        }
        transport.work();
    }
    public void passFireMountain(){
        if(!(transport instanceof Plane)){
            transport=VehicleFactory.gerPlane();
        }
        transport.work();
    }
}
