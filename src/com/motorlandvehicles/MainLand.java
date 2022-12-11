package com.motorlandvehicles;

import com.engine.Engine;
import com.engine.FuelType;
import com.engine.MotorVehicle;

public class MainLand {

    public static void main(String[] args) {

        Engine engine = new Engine(FuelType.Benzin);
        MotorVehicle motorVehicle1 = new MotorVehicle(engine,"FORD",1980);
        Car car1 = new Car(motorVehicle1,"54665",4,4);
        System.out.println(car1);



    }
}
