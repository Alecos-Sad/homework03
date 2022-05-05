package com.itstep.homework.breakfast;

public enum TypeTeaLeaf {

    LOOSE_TEA("Рассыпной чай"),
    BAGS_TEA("Пакетированный чай"),
    LEAF_TEA("Листовой чай"),
    LOOSE_LEAF_TEA("Крупнолистовой чай");

    private final String typeTeaLeaf;

    TypeTeaLeaf(String typeTeaLeaf) {
        this.typeTeaLeaf = typeTeaLeaf;
    }

    @Override
    public String toString() {
        return "TypeTeaLeaf{" +
                "typeTeaLeaf='" + typeTeaLeaf + '\'' +
                '}';
    }
}
