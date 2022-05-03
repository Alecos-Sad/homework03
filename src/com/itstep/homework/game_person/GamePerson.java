package com.itstep.homework.game_person;


import java.util.Arrays;

public class GamePerson {

    String nick;
    int health;
    int power;
    int numMount = 3;
    EquipPerson equipPerson;
    ItemsPerson itemsPerson;
    BagsPerson bagsPerson;
    AnimalPerson[] animalPersons;

    public GamePerson(String nick, int health, int power) {
        this.nick = nick;
        this.health = health;
        this.power = power;
        this.equipPerson = new EquipPerson("1", "1", "1", "1");
        this.itemsPerson = new ItemsPerson("Big", "Napoleon");
        this.bagsPerson = new BagsPerson(1, 1);
        this.animalPersons = new AnimalPerson[numMount];
    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumMount() {
        return numMount;
    }

    public void setNumMount(int numMount) {
        this.numMount = numMount;
    }

    public EquipPerson getEquipPerson() {
        return equipPerson;
    }

    public void setEquipPerson(EquipPerson equipPerson) {
        this.equipPerson = equipPerson;
    }

    public ItemsPerson getItemsPerson() {
        return itemsPerson;
    }

    public void setItemsPerson(ItemsPerson itemsPerson) {
        this.itemsPerson = itemsPerson;
    }

    public BagsPerson getBagsPerson() {
        return bagsPerson;
    }

    public void setBagsPerson(BagsPerson bagsPerson) {
        this.bagsPerson = bagsPerson;
    }

    public AnimalPerson[] addMount(String mount, int count) {
        AnimalPerson animalPerson = new AnimalPerson(mount);
        animalPersons[count] = animalPerson;
        return animalPersons;
    }

    @Override
    public String toString() {
        return "GamePerson{" +
                "nick='" + nick + '\'' +
                ", health=" + health +
                ", power=" + power +
                ", numMount=" + numMount +
                ", equipPerson=" + equipPerson +
                ", itemsPerson=" + itemsPerson +
                ", bagsPerson=" + bagsPerson +
                ", animalPersons=" + Arrays.toString(animalPersons) +
                '}';
    }
}

