package com.itstep.homework.breakfast;

public class Sugar {

    String colorSugar;
    SugarForms sugarForms;

    public Sugar(String colorSugar, SugarForms sugarForms) {
        this.colorSugar = colorSugar;
        this.sugarForms = sugarForms;
    }

    public String getColorSugar() {
        return colorSugar;
    }

    public void setColorSugar(String colorSugar) {
        this.colorSugar = colorSugar;
    }

    public SugarForms getSugarForms() {
        return sugarForms;
    }

    public void setSugarForms(SugarForms sugarForms) {
        this.sugarForms = sugarForms;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "colorSugar='" + colorSugar + '\'' +
                ", sugarForms=" + sugarForms +
                '}';
    }
}
