package com.itstep.homework.game_person;

public class BagsPerson {

    int bag;
    int bag2;

    public BagsPerson(int bag, int bag2) {
        this.bag = bag;
        this.bag2 = bag2;
    }

    public int getBag() {
        return bag;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }

    public int getBag2() {
        return bag2;
    }

    public void setBag2(int bag2) {
        this.bag2 = bag2;
    }

    @Override
    public String toString() {
        return "BagsPerson{" +
                "bag=" + bag +
                ", bag2=" + bag2 +
                '}';
    }
}
