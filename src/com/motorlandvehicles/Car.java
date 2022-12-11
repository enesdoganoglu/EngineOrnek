package com.motorlandvehicles;

import com.engine.MotorVehicle;

public class Car extends MotorLandVehicle{

    public int numberOfDoors;


    public Car( MotorVehicle motorVehicle,String licensePlate, int numberOfWheels,int numberOfDoors) {
        super(motorVehicle,licensePlate,numberOfWheels);
        this.numberOfDoors = numberOfDoors;



    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", licensePlate='" + licensePlate + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", motorVehicle=" + motorVehicle +
                '}';
    }
}
