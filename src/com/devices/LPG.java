package com.devices;

import com.company.Human;

public  class LPG extends Car
{

    public LPG(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);

    }

    public void refuel()
    {
        System.out.println("You have refueled car, LPG seems like a good choice to make it easier on your budget");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price)
    {

    }
}
