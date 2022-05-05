package com.itstep.homework.teapot;


import com.itstep.homework.breakfast.Leaf;
import com.itstep.homework.breakfast.TypeTeaLeaf;
import com.itstep.homework.breakfast.Water;
import com.itstep.homework.breakfast.WaterTemperature;


public class Teapot {

    public static Tea cookTea() {
        return new Tea(
                new Water(WaterTemperature.WARM_WATER),
                new Leaf("Майский чай", TypeTeaLeaf.LEAF_TEA),
                new Honey(),
                new Lemon(5)
        );
    }
}
