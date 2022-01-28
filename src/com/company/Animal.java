package com.company;

public class Animal {
    final String species;
    private Double weight;
    public String name;
    public Boolean alive;
    public Boolean forSale;


    public Animal(String species) {

        this.species = species;
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

    public void sellpet(Human seller, Human buyer, Double price) {
        if (this.forSale == true && buyer.cash >= price) {
            buyer.pet = this;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() +" Bought from "+ seller.toString() +" pet "+ this.toString());
        }else {
            System.out.println("Transaction is impossible");
        }
    }

    }

