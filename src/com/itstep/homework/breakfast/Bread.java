package com.itstep.homework.breakfast;

public class Bread {

    String color;

    public Bread(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bread is " + color;
    }
}
