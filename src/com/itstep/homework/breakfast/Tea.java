package com.itstep.homework.breakfast;

public class Tea {

    Water water;
    Sugar sugar;
    Leaf leaf;

    public Tea(Water water, Sugar sugar, Leaf leaf) {
        this.water = water;
        this.sugar = sugar;
        this.leaf = leaf;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "Tea is " + water + sugar + leaf;
    }
}
