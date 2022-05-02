package com.itstep.homework.game_person;



import java.util.Arrays;

public class GamePerson {


    String nick;
    int health;
    int power;
    int mount = 1;
    EquipPerson equipPerson;
    ItemsPerson itemsPerson;
    BagsPerson bagsPerson;
    AnimalPerson [] animalPerson;



    public GamePerson(String nick, int health, int power) {
        this.nick = nick;
        this.health = health;
        this.power = power;
        this.equipPerson = new EquipPerson("1","1","1","1");
        this.itemsPerson = new ItemsPerson("Big","Napoleon");
        this.bagsPerson = new BagsPerson(1,1);
        this.animalPerson = new AnimalPerson[mount];
    }



    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }

    public void setEquipPerson(EquipPerson equipPerson) {
        this.equipPerson = equipPerson;
    }

    public void setItemsPerson(ItemsPerson itemsPerson) {
        this.itemsPerson = itemsPerson;
    }

    public void setBagsPerson(BagsPerson bagsPerson) {
        this.bagsPerson = bagsPerson;
    }

    public void setAnimalPerson(AnimalPerson[] animalPerson) {
        this.animalPerson = animalPerson;
    }
    public void add(String mount){

    }

    @Override
    public String toString() {
        return "GamePerson{" +
                "nick='" + nick + '\'' +
                ", health=" + health +
                ", power=" + power +
                ", mount=" + mount +
                ", equipPerson=" + equipPerson +
                ", itemsPerson=" + itemsPerson +
                ", bagsPerson=" + bagsPerson +
                ", animalPerson=" + Arrays.toString(animalPerson) +
                '}';
    }
}

