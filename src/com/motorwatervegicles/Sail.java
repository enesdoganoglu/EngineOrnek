package com.motorwatervegicles;

import com.engine.MotorVehicle;

public class Sail extends MotorWaterVehicles{

    String type;

    public Sail(MotorVehicle motorVehicle,int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin, String type) {
        super(motorVehicle,numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sail{" +
                "type='" + type + '\'' +
                ", motorVehicle=" + motorVehicle +
                ", numberOfEngine=" + numberOfEngine +
                ", width=" + width +
                ", height=" + height +
                ", registry='" + registry + '\'' +
                ", hullMaterial='" + hullMaterial + '\'' +
                ", numberOfCabin=" + numberOfCabin +
                '}';
    }
}
