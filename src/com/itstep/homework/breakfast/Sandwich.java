package com.itstep.homework.breakfast;

public class Sandwich {

    Bread bread;
    Butter butter;
    Sousage sausage;

    public Sandwich() {
    }

    public Sandwich(Bread bread, Butter butter, Sousage sausage) {
        this.bread = bread;
        this.butter = butter;
        this.sausage = sausage;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Butter getButter() {
        return butter;
    }

    public void setButter(Butter butter) {
        this.butter = butter;
    }

    public Sousage getSausage() {
        return sausage;
    }

    public void setSausage(Sousage sausage) {
        this.sausage = sausage;
    }

    @Override
    public String toString() {
        return "Sandwich is " + bread + butter + sausage;
    }
}
