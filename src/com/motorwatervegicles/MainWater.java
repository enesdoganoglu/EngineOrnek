package com.motorwatervegicles;

import com.engine.Engine;
import com.engine.FuelType;
import com.engine.MotorVehicle;
import jdk.swing.interop.SwingInterOpUtils;

public class MainWater {

    public static void main(String[] args) {

        Engine engine1 = new Engine(FuelType.Benzin);
        MotorVehicle motorVehicle1 = new MotorVehicle(engine1,"HONDA",1980);
        Yacht yacht = new Yacht(motorVehicle1,2,449,746,"BEYG22571","Çelik",6,10,"HONDA");
        System.out.println(yacht);
        Sail sail = new Sail(motorVehicle1,2,415,705,"FGUI6485","wood",4,"Gulet");
        System.out.println(sail);

    }
}
