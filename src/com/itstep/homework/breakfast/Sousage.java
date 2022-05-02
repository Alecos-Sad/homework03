package com.itstep.homework.breakfast;

public class Sousage {

    String animal;

    public Sousage(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Sousage is " + animal;
    }
}
