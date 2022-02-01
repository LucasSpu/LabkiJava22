package com.devices;

import com.company.Human;

public class Electric extends Car
{
    public Electric(String producer, String model, Integer yearOfProduction, Double price)
    {
        super(producer, model, yearOfProduction);

    }


    public void refuel()
    {
        System.out.println("you have recharged your car, it took some time though");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
