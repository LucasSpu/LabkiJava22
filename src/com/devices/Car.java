package com.devices;

import com.company.Human;
import com.company.sellable;

public abstract class Car extends Device implements sellable {
    public Integer seats;
    public String color;
    public Boolean forSale;
    public Double price;
    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        forSale = true;

    }

    public void turnOn()
    {
        System.out.println("You turn the key");
    }

    public boolean equals(Object o) {
        if ((this == o))
        {
            return true;
        }
        else if ((o == null || getClass() != o.getClass()))
        {
            return false;
        }

        Car car = (Car) o;
        return producer == car.producer &&
                model == car.model;


    }

    public void getPrice()
    {
        System.out.println(this.price);
    }








    public String toString() {
        return producer + " " + model;
    }

    public void sellCar(Human seller, Human buyer, Double price)
    {
        if(seller.hasCar(this) >= 0)
        {
            if (buyer.hasfreePL() >= 0)
            {
                if (buyer.cash >= price)
                {
                    buyer.garage[buyer.hasfreePL()] = this;
                    seller.garage[seller.hasCar(this)] = null;
                    buyer.cash -= price;
                    seller.cash += price;
                    System.out.println(buyer.toString() + " Bought from " + seller.toString() + " car " + this.toString());
                }
                else
                {
                    System.out.println("Transaction buyer doesnt have enough cash");
                }
            }
            else
            {
                System.out.println("Buyers parking lot is full");
            }
        }
        else
        {
            System.out.println("Seller doesnt have this car, or its not for sale");
        }
    }
            public abstract void refuel();
}

