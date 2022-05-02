package com.itstep.homework.breakfast;

public class Leaf {

    String leaf;


    public Leaf(String leaf) {
        this.leaf = leaf;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "Leaf is " + leaf;
    }
}
