package com.itstep.homework.game_person;


public class ItemsPerson {

    String knife;
    String bootleCognjak;

    public ItemsPerson(String knife, String bootleCognjak) {
        this.knife = knife;
        this.bootleCognjak = bootleCognjak;
    }

    public String getKnife() {
        return knife;
    }

    public void setKnife(String knife) {
        this.knife = knife;
    }

    public String getBootleCognjak() {
        return bootleCognjak;
    }

    public void setBootleCognjak(String bootleCognjak) {
        this.bootleCognjak = bootleCognjak;
    }

    @Override
    public String toString() {
        return "ItemsPerson{" +
                "knife='" + knife + '\'' +
                ", bootleCognjak='" + bootleCognjak + '\'' +
                '}';
    }
}
