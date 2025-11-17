package com.gdut.extends_;

public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.setCpu(cpu);
        this.setMemory(memory);
        this.setDisk(disk);
    }

    public String getDetails(){
        return "cpu："+getCpu()+" memory:"+getMemory()+" disk"+getDisk();
    }
    public void printInfo(){
        System.out.println(getDetails());
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public int getMemory() {
        return memory;
    }

    public String getCpu() {
        return cpu;
    }


}

