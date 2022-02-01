package com.company;

import com.creatures.FarmAnimal;
import com.creatures.Pet;
import com.devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        Pet dog = new Pet("canis","Szarik");
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

        Pet cat = new Pet("felis","Sierściuch");;
        cat.feed();

        System.out.println("nazwakota:" + cat.name);

        cat.feed();
        cat.takeforawalk();
        cat.takeforawalk();
        cat.takeforawalk();



        LPG car1 = new LPG("BMW","Serie 1",2005);
        car1.seats = 5;
        car1.color = "Dark Grey";
        car1.price = 15000.00;

        System.out.println("These are:"+car1.owners);



        Human me = new Human();
        me.firstname = "Lucas";
        me.lastname = "Spus";
        me.age = 22;
        me.introduceYourself();
        me.pet = cat;
        me.setSalary(1000.00);
        me.getSalary();
        me.getRaise(3000.00);
        me.cash = 3000.00;

        //me.garageValue();
        me.getPet();

        LPG car2 = new LPG("BMW","Serie 1",2005);
        car2.seats = 5;
        car2.color = "Dark Grey";
        car2.price = 15000.00;
        //car2.owner = me;
        //me.garageValue();

        System.out.println("These are:"+car2.owners);

        LPG car3 = new LPG("Fiat","Punto",2004);
        car3.seats = 5;
        car3.color = "Red";
        car3.price = 3000.00;
       // me.garageValue();
        System.out.println(me.garage[0]);
        System.out.println(me.garage[1]);
        System.out.println(me.garage[2]);

        System.out.println("These are:"+car3.owners);

      System.out.println(car1.equals(car2));
      System.out.println(car1.equals(car3));

      //System.out.println(dog);
      //System.out.println(car1);
      //System.out.println(car2);

      car1.turnOn();

        Human sm1 = new Human();
        sm1.firstname = "Joseph";
        sm1.lastname = "Stalin";
        sm1.age = 44;
        sm1.introduceYourself();
        sm1.pet = cat;
        sm1.cash = 20000.00;

        sm1.getCash();

        sm1.introduceYourself();

        //cat.sell(me, sm1, 5000.00);

        sm1.getCash();
        me.getCash();

        Phone phone1 = new Phone("Nokia","3310",2000, 500.00);

        me.phone = phone1;

        //phone1.sell(me, sm1, 500.00);
        //car1.Carsell(me, sm1, 14000.00);

        sm1.getCash();
        me.getCash();


        FarmAnimal cow = new FarmAnimal("taurus","Mućka");

        cow.beEaten();

        cow.beEaten();

        cow.beEaten();

        cat.feed(30.0);

        Electric car4 = new Electric("Tesla","X",2016,50000.00);
        car4.price = 10000.00;

        car1.refuel();
        car4.refuel();

List<String> appNames = new LinkedList<>();
appNames.add("fb");
appNames.add("Ig");

phone1.installAnApp(appNames);
        URL url1 = new URL("https", "wsb", 442, "FB" + "_" + 2.0);

phone1.installAnApp(url1);

car1.getPrice();
car2.getPrice();
car3.getPrice();

//me.garageValue();

me.setCar(car4,0);
me.getCar(0);
//me.buyCar(car1,1);
        me.buyCar(car1,1);
me.getCar(1);
//me.setCar(car4,3);
//me.getCar(3);
        System.out.println("These are:"+car1.owners);
        System.out.println("These are:"+car4.owners);
me.garageValue();

//System.out.println(me.garage[0]);
//System.out.println(me.garage[1]);
//car1.owners.add(me);

        me.listGarage();
        System.out.println(me.cash);
        System.out.println(sm1.cash);
        //me.sortGarage();
// me.getCar(0);
// sm1.setCar(car4, 0);
        sm1.setCar(car2,0);
        sm1.setCar(car3,1);

        System.out.println("These are:"+car2.owners);
        System.out.println("These are:"+car3.owners);

        // sm1.setCar(car4,2);
me.hasCar(car1);
sm1.sortGarage();
me.sortGarage();
        car1.sellCar(me,sm1,5000.00);

        System.out.println("These are:"+car1.owners);

        me.getCar(1);
sm1.getCar(2);

        System.out.println(me.cash);
        System.out.println(sm1.cash);

      sm1.sortGarage();

      me.sortGarage();

    //  me.setCar(car1,1);
        me.listGarage();


me.buyCar(car3,1);
me.listGarage();
      //  car1.sellCar(me,sm1,10000.00);
        System.out.println(car1.owners);
        System.out.println(car2.owners);
        System.out.println(car3.owners);
        System.out.println(car4.owners);

        Diesel car5 = new Diesel("BMW","Serie 2",2018,30000.00);
        System.out.println(car5.owners);
       // car5.getOwnersL();
car3.getPastOwner(sm1);

car1.getTransaction(me,sm1);
car3.getTransaction(me,sm1);

car3.howManyTransactions();
car1.howManyTransactions();
car2.howManyTransactions();
        }
    }
