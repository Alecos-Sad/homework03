package com.itstep.homework.breakfast;

public class Sugar {

    String color;

    public Sugar() {
    }

    public Sugar(String color) {
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
        return "Sugar is " + color;
    }
}
