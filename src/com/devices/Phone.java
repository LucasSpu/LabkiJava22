package com.devices;

public class Phone extends Device
{
String color;


    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
    }


    public void turnOn() {
        {
            System.out.println("You turn on phone");
        }
    }
}
