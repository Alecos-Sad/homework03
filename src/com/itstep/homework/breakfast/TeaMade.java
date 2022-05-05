package com.itstep.homework.breakfast;

public class TeaMade {

    public static Tea getTea(){
        return new Tea(new Water(WaterTemperature.HOT_WATER),
                new Sugar("White",SugarForms.GRANULATED),
                new Leaf("Indian Tea", TypeTeaLeaf.BAGS_TEA));
    }


}
