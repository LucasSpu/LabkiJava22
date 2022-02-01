package com.devices;

import com.company.Human;
import com.company.sellable;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Car extends Device implements sellable {
    public Integer seats;
    public String color;
    public Boolean forSale;
    public Double price;
    //public Human owner;
    public ArrayList<Human> owners = new ArrayList<>();
    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        forSale = true;

    }

    //public void setOwner(Human owner)
    {

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


public void getPastOwner(Human owner)
{
   if (owners.contains(owner))
   {
       System.out.println("person is one of previous owners");
   }
   else
       System.out.println("person is not one of previous owners");
}

public void getTransaction(Human seller, Human buyer)
{
    if(owners.size() > 1)
    for(Integer i = 0; i < owners.size(); i++)
    {
        for (Integer j = i+1; j < owners.size(); j++)
        {
            if(owners.get(i) == seller && owners.get(j) == buyer)
            {
                System.out.println("Transaction between these people was made");
                break;
            }
            else
                System.out.println("There was no transaction between these people");
        }
    }
    else
        System.out.println("There is only one owner");
}

public void howManyTransactions()
{
   Integer k = owners.size()-1;
    if(k > 0)
        System.out.println("Car was subject to : "+k+" transactions");
    else
        System.out.println("Car wasnt subject to any prior transactions");
}





    public String toString() {
        return producer + " " + model;
    }

    public void sellCar(Human seller, Human buyer, Double price)
    {
        if(seller.hasCar(this) >= 0)
        {
            if(owners.get(owners.size()-1) == seller && owners.size()-1 >= 0 )
            {
                if (buyer.hasfreePL() >= 0)
                {
                    if (buyer.cash >= price)
                    {
                        buyer.garage[buyer.hasfreePL()] = this;
                        seller.garage[seller.hasCar(this)] = null;
                        owners.add(buyer);
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
                System.out.println("Seller is not owner of a car");
            }

        }
        else
        {
            System.out.println("Seller doesnt have this car, or its not for sale");
        }
    }
            public abstract void refuel();
}

