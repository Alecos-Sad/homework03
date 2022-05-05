package com.itstep.homework.breakfast;

public enum BreadColor {

    BLACK("Черный хлеб"),
    WHITE("Белый хлеб");

    private final String breadColor;

    BreadColor(String breadColor) {
        this.breadColor = breadColor;
    }

    @Override
    public String toString() {
        return "BreadColor{" +
                "breadColor='" + breadColor + '\'' +
                '}';
    }
}
