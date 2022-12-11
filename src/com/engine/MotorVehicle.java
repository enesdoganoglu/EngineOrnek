package com.engine;

public class MotorVehicle  {

   private String brand;
   private int year;

   public Engine engine;

    public MotorVehicle(Engine engine,String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "MotorVehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}

