package com.itstep.homework.breakfast;

public class Water {

       private WaterTemperature waterTemperature;

    public Water(WaterTemperature waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public WaterTemperature getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(WaterTemperature waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    @Override
    public String toString() {
        return "Water{" +
                "waterTemperature=" + waterTemperature +
                '}';
    }
}
