package com.motorwatervegicles;

import com.engine.MotorVehicle;

public class Yacht extends MotorWaterVehicles{


    int numberOfBeds;
    String engineBrand;

    public Yacht(MotorVehicle motorVehicle,int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin, int numberOfBeds, String engineBrand) {
        super(motorVehicle,numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.numberOfBeds = numberOfBeds;
        this.engineBrand = engineBrand;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "numberOfBeds=" + numberOfBeds +
                ", engineBrand='" + engineBrand + '\'' +
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
