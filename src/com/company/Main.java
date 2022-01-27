package com.company;

import com.devices.Car;
import com.devices.Device;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.feed();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();
        dog.takeforawalk();


        System.out.println("nazwapsa:" + dog.name);

        Animal cat = new Animal("felis");
        cat.name = "Sierściuch";
        cat.feed();

        System.out.println("nazwakota:" + cat.name);

        cat.feed();
        cat.takeforawalk();
        cat.takeforawalk();
        cat.takeforawalk();
        cat.takeforawalk();
        cat.takeforawalk();

        Car car1 = new Car("BMW","Serie 1",2005);

        car1.seats = 5;

        car1.color = "Dark Grey";
        car1.price = 13000;

        Human me = new Human();
        me.firstname = "Lucas";
        me.lastname = "Spus";
        me.age = 22;
        me.introduceYourself();
        me.pet = cat;
        me.setSalary(1000.00);
        me.getSalary();
        me.getRaise(3000.00);

        me.getCar();
        me.buyCar(car1);

        me.getCar();

        me.getPet();

        Car car2 = new Car("BMW","serie 1",2005);


        car2.seats = 5;

        car2.color = "Dark Grey";
        car2.price = 13000;

        Car car3 = new Car("Fiat","Punto",2004);


        car3.seats = 5;

        car3.color = "Red";
        car3.price = 5000;



      System.out.println(car1.equals(car2));
      System.out.println(car1.equals(car3));

      System.out.println(dog);
      System.out.println(car1);
      System.out.println(car2);

      car1.turnOn();


	// write your code here
    }
}
