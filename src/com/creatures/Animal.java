package com.creatures;

import com.company.Human;
import com.company.sellable;

public abstract class Animal implements sellable, Feedable

{
    public final String species;
    public Double weight;
    public String name;
    public Boolean alive;
    public Boolean forSale;
    public Double foodWeight;

    public Animal(String species, String name) {

        this.species = species;
        this.name = name;
        alive = true;
        forSale = true;

        if (this.species == "canis")
        {
            this.weight = 10.0;
        }
        else if (this.species == "felis")
        {
            this.weight = 2.0;
        }
        else if(this.species == "Taurus")
        {
            this.weight = 500.00;
        }
        else
        {
            this.weight = 1.0;
        }
    }


        public void feed()
        {
            if (this.weight > 0 )
            {
                this.weight++;
            }
            else if (this.weight < 1)
            {
                System.out.println("it would be unwise to feed a dead animal");
            }
        }


    public void feed(Double foodWeight)
    {
        if (this.weight > 0 )
        {
            this.weight+=foodWeight;
            System.out.println("" +this.weight);
        }
        else if (this.weight < 1)
        {
            System.out.println("it would be unwise to feed a dead animal");
        }
    }

    public void takeforawalk() {
            if (this.weight > 0)
            {
                this.weight--;
            }
            else if (this.weight < 1)
            {
                System.out.println("You would look weird pulling a dead animal");
            }
        }

            public String toString()
            {
                return species+ " " +name;
            }

    public void sell(Human seller, Human buyer, Double price)
    {
        if (this.forSale == true && buyer.cash >= price)
        {
            buyer.pet = this;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() +" Bought from "+ seller.toString() +" pet "+ this.toString());
        }
        else
        {
            System.out.println("Transaction is impossible");
        }
    }

    }

