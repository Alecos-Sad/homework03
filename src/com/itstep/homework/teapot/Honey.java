package com.itstep.homework.teapot;

public class Honey {

    String name;

    public Honey() {
        this.name = "Bee";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Honey{" +
                "name='" + name + '\'' +
                '}';
    }
}
