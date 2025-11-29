package com.gdut.learning.homework.o5;

/**
 * @author Sparkle
 * @version 1.0
 */
public enum Color {
    RED(255.0,0.0,0.0),BLUE(0,0,255),
    GREEN(0,0,255);

    private double redValue;
    private double greenValue;
    private double blueValue;

    Color(double redValue, double greenValue, double blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
}
