package com.techreturners.cats;

public class LionCat extends CatImpl{

    public  LionCat(){
        this.asleep= false;
        this.setting ="wild";
        this.averageHeight=1100;
    }

    public String eat(){
        return "Roar!!!!";
    }


}
