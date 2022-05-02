package com.itstep.homework.teapot;

import com.itstep.homework.breakfast.Leaf;
import com.itstep.homework.breakfast.Water;

/**
 * попробуй создать чайник, в который ты отправляешь воду, листья чая, мед, лимон и получаешь чай
 */
public class Teapot {
    Water water;
    Leaf leaf;
    Lemon lemon;
    Honey honey;

    public Teapot(Water water, Leaf leaf, Lemon lemon, Honey honey) {
        this.water = water;
        this.leaf = leaf;
        this.lemon = lemon;
        this.honey = honey;
    }

    public Tea cook(){
        return new Tea(water,leaf,lemon,honey);
    }

}
