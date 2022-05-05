package com.itstep.homework.teapot;

import com.itstep.homework.breakfast.Leaf;
import com.itstep.homework.breakfast.Water;

public class Tea {

    private Water water;
    private Leaf leaf;
    private Honey honey;
    private Lemon lemon;

    public Tea(Water water, Leaf leaf, Honey honey, Lemon lemon) {
        this.water = water;
        this.leaf = leaf;
        this.honey = honey;
        this.lemon = lemon;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    public Honey getHoney() {
        return honey;
    }

    public void setHoney(Honey honey) {
        this.honey = honey;
    }

    public Lemon getLemon() {
        return lemon;
    }

    public void setLemon(Lemon lemon) {
        this.lemon = lemon;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "water=" + water +
                ", leaf=" + leaf +
                ", honey=" + honey +
                ", lemon=" + lemon +
                '}';
    }
}
