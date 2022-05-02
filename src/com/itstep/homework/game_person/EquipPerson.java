package com.itstep.homework.game_person;

public class EquipPerson {

    String head;
    String chest;
    String legs;
    String sword;

    public EquipPerson(String head, String chest, String legs, String sword) {
        this.head = head;
        this.chest = chest;
        this.legs = legs;
        this.sword = sword;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    @Override
    public String toString() {
        return "EquipPerson{" +
                "head='" + head + '\'' +
                ", chest='" + chest + '\'' +
                ", legs='" + legs + '\'' +
                ", sword='" + sword + '\'' +
                '}';
    }
}
