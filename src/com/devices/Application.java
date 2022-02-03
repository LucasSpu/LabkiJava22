package com.devices;

public class Application
{
    public  Double appPrice;
public  String appName;
public  Double appVer;
    public Application(String appName, Double appPrice, Double appVer)
    {
      this.appName = appName;
      this.appPrice = appPrice;
      this.appVer = appVer;
    }

    public String toString()
    {
        return appName+" "+appVer;
    }



    public String getAppName()
    {
        return appName;//+" "+appVer+" "+appPrice;
    }

    public Double getAppPrice()
    {
        return appPrice;//+" "+appVer+"
    }
}
