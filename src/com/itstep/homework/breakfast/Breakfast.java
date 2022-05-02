package com.itstep.homework.breakfast;

public class Breakfast {

    Sandwich sandwich;
    Tea tea;

    public Breakfast(Sandwich sandwich, Tea tea) {
        this.sandwich = sandwich;
        this.tea = tea;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public Tea getTea() {
        return tea;
    }

    public void setTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        return "Breakfast{" +
                "sandwich=" + sandwich +
                ", tea=" + tea +
                '}';
    }
}
