package com.techreturners.cats;

public abstract class CatImpl implements Cat{
    protected boolean asleep ;
    protected  String setting ;
    protected  int averageHeight;

    public boolean isAsleep(){
        return this.asleep;
    }
    public void goToSleep(){
        this.asleep = true;
    }
    public void wakeUp(){
        this.asleep = false;
    }
    public  int getAverageHeight(){
        return averageHeight;
    }
    public  String getSetting(){
        return setting;
    }
    public  String run(){return "Catch me if you can";}

    public abstract String eat();



}
