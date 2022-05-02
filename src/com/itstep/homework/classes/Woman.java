package com.itstep.homework.classes;

public class Woman {

    private String name;
    private final char sex;

    public Woman(String name) {
        this(name, 'F');
    }

    public Woman(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}

