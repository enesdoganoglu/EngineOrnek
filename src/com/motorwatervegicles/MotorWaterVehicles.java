package com.motorwatervegicles;

import com.engine.MotorVehicle;

public abstract class MotorWaterVehicles {

    public  MotorVehicle motorVehicle;
    public int numberOfEngine;
    public int width;
    public int height;
    public String registry;
    public String hullMaterial;
    public int numberOfCabin;

    public MotorWaterVehicles(MotorVehicle motorVehicle, int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin) {
        this.numberOfEngine = numberOfEngine;
        this.width = width;
        this.height = height;
        this.registry = registry;
        this.hullMaterial = hullMaterial;
        this.numberOfCabin = numberOfCabin;
        this.motorVehicle = motorVehicle;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public int getNumberOfCabin() {
        return numberOfCabin;
    }

    public void setNumberOfCabin(int numberOfCabin) {
        this.numberOfCabin = numberOfCabin;
    }

    @Override
    public String toString() {
        return "MotorWaterVehicles{" +
                "motorVehicle=" + motorVehicle +
                ", numberOfEngine=" + numberOfEngine +
                ", width=" + width +
                ", height=" + height +
                ", registry='" + registry + '\'' +
                ", hullMaterial='" + hullMaterial + '\'' +
                ", numberOfCabin=" + numberOfCabin +
                '}';
    }
}
