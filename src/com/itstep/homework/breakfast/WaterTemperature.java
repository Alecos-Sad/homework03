package com.itstep.homework.breakfast;

public enum WaterTemperature {

    COLD_WATER("Cold water "),
    WARM_WATER("Warm water"),
    HOT_WATER("Hot water");

    private final String temperature;

    WaterTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WaterTemperature{" +
                "temperature='" + temperature + '\'' +
                '}';
    }
}
