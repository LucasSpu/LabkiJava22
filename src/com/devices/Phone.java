package com.devices;



import com.company.Human;
import com.company.sellable;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device implements sellable {
    private static final String DEFAULT_VERSION_NAME = "1.0";
    private static final String DEFAULT_SERVER_NAME = "www.apps.wsb.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";
    String color;
    public Boolean forSale;
    public String installedApp;
    public LinkedHashSet<Application> applications = new LinkedHashSet<>();


    public Phone(String producer, String model, Integer yearOfProduction, Double price) throws MalformedURLException {
        super(producer, model, yearOfProduction);
        forSale = true;
        installedApp = "OS";
        price = this.price;
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


    public void installAnApp(String appName) {
        System.out.println(" Installed app: " + appName);
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }


    public void installAnApp(String appName, String version) {
        System.out.println(" Installed app: " + appName + " version: " + version);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }


    public void installAnApp(String appName, String version, String server) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL_NAME, server, 443, appName + "_" + version);
            System.out.println("Installed: " + appName + " Version: " + version + " from: " + server);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            System.out.println("Address like this doesn't exist");
            e.printStackTrace();
        }

    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }

    }


    public void installAnApp(URL url) {
        System.out.println("Installed app from: " + url);
    }


    public void installAPP(Human buyer, Application application)
    {
        if (buyer.cash > application.appPrice) {
            applications.add(application);
            buyer.cash -= application.appPrice;
            System.out.println("App " + application.appName + " " + application.appVer + " has been purchased, and installed");
        } else
            System.out.println("You dont have enough money for this app");
    }


    public void isAppInstalled(Application application) {
        if (applications.contains(application)) {
            System.out.println("This app is installed");
        } else
            System.out.println("This app is not installed");
    }

public void isAppNameInstalled(String appName)
{
    for(Application application : this.applications)
    {
        if (application.appName.matches(appName))
        {
            System.out.println("Phone has this app " + appName);
            return;
        }

    }
    System.out.println("phone doesnt have this app");
}


    public void freeInstalledApps()
    {
          for(Application application : this.applications)
        {
             if(application.appPrice == 0.0)
                    System.out.println(application);
        }
    }

public void listOfAppsPrices()
{
    Double appWorth = 0.00;
    for (Application application : this.applications)
    {
      appWorth += application.appPrice;
    }
    System.out.println("Combined worth of applications is: "+appWorth);
}

public void AppListAlphabet()
{
    Application[] i = applications.toArray(new Application[applications.size()]);
    Arrays.sort(i, Comparator.comparing(Application::getAppName));
    System.out.println(Arrays.toString(i));
}

public void AppListbyPrice()
{
        Application[] j = applications.toArray(new Application[applications.size()]);
        Arrays.sort(j, Comparator.comparing(Application::getAppPrice));
    System.out.println(Arrays.toString(j));

}



}
