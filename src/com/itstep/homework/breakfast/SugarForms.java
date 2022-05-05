package com.itstep.homework.breakfast;

public enum SugarForms {

    RAFINATED("Сахар рафинад"),
    GRANULATED("Сахар песок");

    private final String sugarForms;

    SugarForms(String sugarForms) {
        this.sugarForms = sugarForms;
    }

    @Override
    public String toString() {
        return "SugarForms{" +
                "sugarForms='" + sugarForms + '\'' +
                '}';
    }
}
