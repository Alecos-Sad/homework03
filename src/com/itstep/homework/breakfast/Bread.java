package com.itstep.homework.breakfast;

public class Bread {

BreadColor breadColor;

    public Bread(BreadColor breadColor) {
        this.breadColor = breadColor;
    }

    public BreadColor getBreadColor() {
        return breadColor;
    }

    public void setBreadColor(BreadColor breadColor) {
        this.breadColor = breadColor;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadColor=" + breadColor +
                '}';
    }
}
