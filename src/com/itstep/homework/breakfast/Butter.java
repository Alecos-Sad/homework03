package com.itstep.homework.breakfast;

public class Butter {

    String creamy;


    public Butter(String creamy) {
        this.creamy = creamy;
    }

    public String getCreamy() {
        return creamy;
    }

    public void setCreamy(String creamy) {
        this.creamy = creamy;
    }

    @Override
    public String toString() {
        return "Butter is " + creamy;
    }
}

