package com.devices;



import com.company.Human;
import com.company.sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.LinkedList;

public class Phone extends Device implements sellable {
    private static final String DEFAULT_VERSION_NAME ="1.0" ;
    private static final String DEFAULT_SERVER_NAME = "www.apps.wsb.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";
    String color;
    public Boolean forSale;
    public String installedApp;


    public Phone(String producer, String model, Integer yearOfProduction) throws MalformedURLException {
        super(producer, model, yearOfProduction);
        forSale = true;
        installedApp = "OS";
    }


    public void turnOn() {
        {
            System.out.println("You turn on phone");
        }
    }


    public void sell(Human seller, Human buyer, Double price) {
        if (this.forSale == true && buyer.cash >= price) {
            buyer.phone = this;
            seller.phone = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() + " Bought from " + seller.toString() + " phone " + this.toString());
        } else {
            System.out.println("Transaction is impossible");
        }
    }


    public void installAnApp(String appName)
    {
        System.out.println(" Installed app: " + appName);
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }


    public void installAnApp(String appName, String version) {
        System.out.println(" Installed app: " + appName + " version: " + version);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }


    public void installAnApp(String appName, String version, String server)
    {
    try
    {
        URL url = new URL(DEFAULT_PROTOCOL_NAME, server, 443, appName + "_" + version);
        System.out.println("Installed: "+appName+" Version: "+version+" from: "+server);
        this.installAnApp(url);
    }
     catch(MalformedURLException e)
    {
        System.out.println("Address like this doesn't exist");
        e.printStackTrace();
    }

}
    public void installAnApp(List<String> appNames)
    {
        for (String appName : appNames)
        {
            this.installAnApp(appName);
        }

    }



    public void installAnApp(URL url)
    {
        System.out.println("Installed app from: "+url);
    }
}
