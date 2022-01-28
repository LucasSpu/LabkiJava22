package com.devices;



import com.company.Human;
import com.company.sellable;

public class Phone extends Device {
    String color;
    public Boolean forSale;



    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        forSale = true;
    }


    public void turnOn() {
        {
            System.out.println("You turn on phone");
        }
    }


    public void sellphone(Human seller, Human buyer, Double price) {
        if (this.forSale == true && buyer.cash >= price) {
            buyer.phone = this;
            seller.phone = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() + " Bought from " + seller.toString() + " phone " + this.toString());
        }
        else
        {
            System.out.println("Transaction is impossible");
        }
    }
}
