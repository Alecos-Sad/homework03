package com.itstep.homework.breakfast;

public class Leaf {

    String brand;
    TypeTeaLeaf typeTeaLeaf;

    public Leaf(String brand, TypeTeaLeaf typeTeaLeaf) {
        this.brand = brand;
        this.typeTeaLeaf = typeTeaLeaf;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public TypeTeaLeaf getTypeTeaLeaf() {
        return typeTeaLeaf;
    }

    public void setTypeTeaLeaf(TypeTeaLeaf typeTeaLeaf) {
        this.typeTeaLeaf = typeTeaLeaf;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "brand='" + brand + '\'' +
                ", typeTeaLeaf=" + typeTeaLeaf +
                '}';
    }
}
