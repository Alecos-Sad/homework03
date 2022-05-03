package com.itstep.homework.game_person;


public class ItemsPerson {

    String knife;
    String bootle;

    public ItemsPerson(String knife, String bootle) {
        this.knife = knife;
        this.bootle = bootle;
    }

    public String getKnife() {
        return knife;
    }

    public void setKnife(String knife) {
        this.knife = knife;
    }

    public String getBootle() {
        return bootle;
    }

    public void setBootle(String bootle) {
        this.bootle = bootle;
    }

    @Override
    public String toString() {
        return "ItemsPerson{" +
                "knife='" + knife + '\'' +
                ", bootleCognjak='" + bootle + '\'' +
                '}';
    }
}
