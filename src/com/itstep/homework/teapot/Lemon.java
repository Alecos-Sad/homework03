package com.itstep.homework.teapot;

public class Lemon {

    String color;
    int size;

    public Lemon() {
    }

    public Lemon(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Lemon{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
