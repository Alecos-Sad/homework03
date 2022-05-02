package com.itstep.homework.teapot;

import com.itstep.homework.breakfast.Leaf;
import com.itstep.homework.breakfast.Water;

public class Tea {
    Water water;
    Leaf leaf;
    Lemon lemon;
    Honey honey;



    public Tea(Water water, Leaf leaf, Lemon lemon, Honey honey) {
        this.water = water;
        this.leaf = leaf;
        this.lemon = lemon;
        this.honey = honey;
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

    public Lemon getLemon() {
        return lemon;
    }

    public void setLemon(Lemon lemon) {
        this.lemon = lemon;
    }

    public Honey getHoney() {
        return honey;
    }

    public void setHoney(Honey honey) {
        this.honey = honey;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "water=" + water +
                ", leaf=" + leaf +
                ", lemon=" + lemon +
                ", honey=" + honey +
                '}';
    }
}
