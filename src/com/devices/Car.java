package com.devices;

import com.company.Human;
import com.company.sellable;

public class Car extends Device implements sellable {
    public Integer seats;
    public String color;
    public Integer price;
    public Boolean forSale;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        forSale = true;
    }

    public void turnOn() {
        System.out.println("You turn the key");
    }

    public boolean equals(Object o) {
        if ((this == o)) {
            return true;
        } else if ((o == null || getClass() != o.getClass())) {
            return false;
        }
        Car car = (Car) o;
        return producer == car.producer &&
                model == car.model;


    }

    public String toString() {
        return producer + " " + model;
    }

    public void sell(Human seller, Human buyer, Double price) {

        if (this.forSale == true && buyer.cash >= price) {
            buyer.car = this;
            seller.car = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() + " Bought from " + seller.toString() + " car " + this.toString());
        } else {
            System.out.println("Transaction is impossible");


        }
    }
}