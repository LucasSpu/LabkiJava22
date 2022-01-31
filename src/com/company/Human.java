package com.company;


import com.creatures.Animal;
import com.devices.Car;
import com.devices.Phone;
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
       forSale = false;
       this.garage = new Car[DEFAULT_GARAGE_SIZE];
   }

   Human(Integer garageSize)
   {
       this.salary = 1200.0;
       this.garage = new Car[garageSize];
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


    public Car getCar(Integer parkingLotNumber)
        {
            return this.garage[parkingLotNumber];
        }

    public void buyCar(Car car, Integer parkingLotNumber) {
        if (car.price < salary) {
            System.out.println("You bought the car for cash");
            this.garage[parkingLotNumber] = car;
        } else if (car.price / 12 < salary) {
            System.out.println("You took a loan for a " + car.producer + " " + car.model);
            this.garage[parkingLotNumber] = car;
        } else {
            System.out.println("Go to college, change your career, or ask for a raise");
        }

    }
        public String toString()
        {
            return firstname+" "+lastname;
        }



}

