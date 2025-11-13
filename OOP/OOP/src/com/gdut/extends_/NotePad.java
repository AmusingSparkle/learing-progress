package com.gdut.extends_;

public class NotePad extends PC{
    private String keyBoard;

    public NotePad(String cpu, int memory, int disk, String brand, String keyBoard) {
        super(cpu, memory, disk, brand);
        this.keyBoard = keyBoard;
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void printInfo() {
        System.out.println(getDetails()+" brand:"+getBrand()+" keyboard:"+getKeyBoard());

    }
}
