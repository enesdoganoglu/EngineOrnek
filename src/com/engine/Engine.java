package com.engine;

public class Engine  {

    private final int DEFAULT_ENGINEPOWER=100;
    private final int  DEFAULT_ENGINEVOLUME= 150;

    private int enginePower = DEFAULT_ENGINEPOWER;
    private int engineVolume =  DEFAULT_ENGINEVOLUME;
    public FuelType fuelType;


    public Engine(FuelType fuelType, int enginePower, int engineVolume) {

        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

   public Engine(FuelType fuelType ) {
        this.fuelType = fuelType;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", engineVolume=" + engineVolume +
                ", fuelType=" + fuelType +
                '}';
    }
}

