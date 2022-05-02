package com.itstep.homework.game_person;



public class GamePerson {


    String nick;
    int health;
    int power;
    EquipPerson equipPerson;
    ItemsPerson itemsPerson;


    public GamePerson(String nick, int health, int power) {
        this.nick = nick;
        this.health = health;
        this.power = power;
        this.equipPerson = new EquipPerson("1","1","1","1");


    }


}

