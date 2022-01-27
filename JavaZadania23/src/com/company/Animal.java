package com.company;

public class Animal {
    final String species;
    private Double weight;
    public String name;
    public Boolean alive;

    public Animal(String species) {

        this.species = species;
        alive = true;

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

    }

