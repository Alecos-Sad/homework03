package com.itstep.homework.breakfast;

public class Sousage {

   private SousageMade sousageMade;

    public Sousage(SousageMade sousageMade) {
        this.sousageMade = sousageMade;
    }

    public SousageMade getSousageMade() {
        return sousageMade;
    }

    public void setSousageMade(SousageMade sousageMade) {
        this.sousageMade = sousageMade;
    }

    @Override
    public String toString() {
        return "Sousage{" +
                "sousageMade=" + sousageMade +
                '}';
    }
}
