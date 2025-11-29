package com.gdut.learning.homework;

/**
 * @author Sparkle
 * @version 1.0
 */
public enum Color implements ShowDetail{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),
    YELLOW(255,2555,0),GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void showDetail() {
        System.out.println(this.name()+" "+redValue+" "+greenValue+" "+blueValue);
    }
}
