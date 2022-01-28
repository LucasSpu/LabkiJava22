package com.creatures;

import java.sql.SQLOutput;

public class FarmAnimal extends Animal implements edible
{
    public FarmAnimal(String species, String name)
    {
        super(species, name);
    }

    public void beEaten()
    {
        if(this.weight > 0)
        {
            System.out.println("You ate an animal");
            this.weight = 0.00;
        }
        else if(this.weight <= 0)
        {
            System.out.println("This animal might be rotten, you shouldnt eat unfresh meat");
        }
    }

}
