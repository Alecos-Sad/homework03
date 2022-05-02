package com.itstep.homework.classes;

public class Family {

    Man man;
    Woman woman;

    public Family(Man man, Woman woman) {
        this.man = man;
        this.woman = woman;
    }

    public void result() {
        System.out.println("Результат: Каин и Авель");
    }
}
