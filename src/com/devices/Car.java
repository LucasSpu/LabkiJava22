package com.devices;

public class Car extends Device {
 public Integer seats;
 public String color;
 public Integer price;

  public Car(String producer, String model, Integer yearOfProduction)
  {
     super(producer, model, yearOfProduction);
  }

  public void turnOn()
  {
     System.out.println("You turn the key");
  }

   public boolean equals(Object o)
   {
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
   public String toString()
   {
      return producer+" "+model;
   }
}
