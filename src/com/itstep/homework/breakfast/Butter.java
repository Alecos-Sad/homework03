package com.itstep.homework.breakfast;

public class Butter {

    String creamy;


    public Butter() {
        this.creamy = "Creamy";
    }

    public String getCreamy() {
        return creamy;
    }

    public void setCreamy(String creamy) {
        this.creamy = creamy;
    }

    @Override
    public String toString() {
        return "Butter{" +
                "creamy='" + creamy + '\'' +
                '}';
    }
}

