package com.devices;

public abstract class Device
{
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public static Double price;

    public Device(String producer, String model, Integer yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString()
    {
       return producer+" "+model+" "+yearOfProduction;
    }

   public abstract void turnOn();


    public Integer getYearOfProduction()
    {
     return yearOfProduction;
    }
}
