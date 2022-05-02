package com.itstep.homework.game_person;


public class AnimalPerson {

    String mount;

    public AnimalPerson(String mount) {
        this.mount = mount;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    @Override
    public String toString() {
        return "AnimalPerson{" +
                "mount='" + mount + '\'' +
                '}';
    }
}
