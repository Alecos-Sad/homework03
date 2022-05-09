package com.itstep.homework.classes;

public class Eva {

    private Adam adam;

    public Eva() {
    }

    public void setAdam(Adam adam) {
        this.adam = adam;
    }

    @Override
    public String toString() {
        return "Eva{" +
                "adam=" + adam +
                '}';
    }
}
