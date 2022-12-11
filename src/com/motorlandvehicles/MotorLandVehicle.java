package com.motorlandvehicles;
import com.engine.MotorVehicle;


public abstract class MotorLandVehicle {

    public String licensePlate;
    public int numberOfWheels;
    public MotorVehicle motorVehicle;

    public MotorLandVehicle(MotorVehicle motorVehicle,String licensePlate, int numberOfWheels) {
        this.licensePlate = licensePlate;
        this.numberOfWheels = numberOfWheels;
        this.motorVehicle = motorVehicle;
    }



    public String getLicensePlate() {
        return licensePlate;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "MotorLandVehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", motorVehicle=" + motorVehicle +
                '}';
    }
}
