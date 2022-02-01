package com.devices;

import com.company.Human;

public class Diesel extends Car
{

    public Diesel(String producer, String model, Integer yearOfProduction, Double price)
    {
        super(producer, model, yearOfProduction);

    }


    public void refuel()
    {
        System.out.println("You have refueled your Car, diesel is really expensive these days");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
