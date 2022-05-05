package com.itstep.homework.breakfast;

public class Breakfast {

    private Sandwich sandwich;
    private Tea tea;


    public Breakfast() {
        this.sandwich = SandwichMade.getSandwich();
        this.tea = TeaMade.getTea();
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
