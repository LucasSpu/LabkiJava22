package com.company;


import com.creatures.Animal;
import com.devices.Car;
import com.devices.Device;
import com.devices.Phone;

import java.util.Arrays;
import java.util.Comparator;

public class Human
{

    private static final int DEFAULT_GARAGE_SIZE = 3;
    public Animal pet;
    String firstname;
    String lastname;
    Integer age;
    private Double salary;
    public Car[] garage;
   
    public Double cash;
    public Boolean forSale;
    public Phone phone;

   Human()
   {
       this.salary = 1200.0;
       forSale = false;
       this.garage = new Car[DEFAULT_GARAGE_SIZE];
   }

   //Human(Integer garageSize)
   {

  //     this.garage = new Car[garageSize];
   }



    public void introduceYourself()
    {
        System.out.println("my firstname is " + firstname);
        System.out.println("my lastname is " + lastname);
    }

    public void getPet()
    {
        System.out.println("Your pets name is: " +pet.name);
    }


    public void getCash()
    {
        System.out.println("Your current cash amount is: " + cash);
    }
    public void setSalary(double sal)
    {
        this.salary = sal;
    }
    public void getSalary()
    {
        System.out.println("Your current salary is: " + salary);
    }
    public void getRaise(double raise)
    {
        if (raise < salary) {
            System.out.println("You cannot enter negative amount");
        } else {
            System.out.println("Data has been sent do accounting system");
            System.out.println("Collect the contract annex from ms.Hania in staff management.");
            System.out.println("The government institutions have been informed about the raise");
            this.salary = raise;
            System.out.println("Your current salary is: " + salary);
        }
    }

    public void setCar(Car car, Integer parkingLotNumber)
    {
        this.garage[parkingLotNumber] = car;
        System.out.println("added car to garage lot : " +parkingLotNumber);
    }

    public Car getCar(Integer parkingLotNumber)
        {
            System.out.println("the car in parking lot number "+parkingLotNumber+" is "+this.garage[parkingLotNumber]);
            return this.garage[parkingLotNumber];

        }

        public void garageValue()
        {
           //System.out.println(this.garage[0].price + this.garage[1].price + this.garage[2].price);
            Double value;
            value = 0.00;

            for (Car car : this.garage)
            {
                if (car == null)
                value += 0;
                else
                    value += car.price;
            }
            System.out.println("Your garage value is "+value);
        }

    public void buyCar(Car car, Integer parkingLotNumber)
    {
        if (car.price < salary) {
            System.out.println("You bought the car for cash");
            System.out.println("it has been added to parking lot number: "+parkingLotNumber);
            this.garage[parkingLotNumber] = car;
        } else if (car.price / 12 < salary)
        {
            System.out.println("You took a loan for a " + car.producer + " " + car.model);
            System.out.println("It has been added to parking lot number: "+parkingLotNumber);
            this.garage[parkingLotNumber] = car;
        }
        else
        {
            System.out.println("Go to college, change your career, or ask for a raise");
        }

    }

    public String toString()
    {
        return firstname+" "+lastname;
    }

        public void listGarage()
        {
            for (int i=0; i < garage.length; i++)
            System.out.println(garage[i]);
        }

        public int hasfreePL()
        {
            for (int j = 0; j < this.garage.length; j++)
            {
                if(this.garage[j] == null)
                {
                    return j;
                }
            }
            return -1;
        }


    public int hasCar(Car car)
      {
        for (int i = 0; i < this.garage.length; i++)
       {
            if(this.garage[i] == car)
            {
              //  System.out.println("That person owns the car");
                return i;
            }
       }
       // System.out.println("that person doesnt own this car");
        return -1;
      }

      public void sortGarage()
      {
          Arrays.sort(garage, Comparator.nullsLast(Comparator.comparing(Device::getYearOfProduction)));
          System.out.println(Arrays.toString(garage));
      }


}

