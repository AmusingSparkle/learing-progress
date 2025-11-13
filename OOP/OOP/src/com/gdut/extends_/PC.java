package com.gdut.extends_;

public class PC extends Computer{
    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.setBrand(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo() {
       System.out.println(getDetails()+" brand:"+getBrand());
    }
}
