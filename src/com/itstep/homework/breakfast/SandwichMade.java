package com.itstep.homework.breakfast;

public class SandwichMade {

    public static Sandwich getSandwich() {
        return new Sandwich(new Bread(BreadColor.WHITE), new Butter(), new Sousage(SousageMade.CHCKEN));
    }
}
