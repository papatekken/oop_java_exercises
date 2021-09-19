package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatImpl{
    private Random  random;
    public  DomesticCat(){
        this.asleep= false;
        this.setting ="domestic";
        this.averageHeight=23;
        this.random = new Random();
    }

    public  DomesticCat(int seed){
        this.asleep= false;
        this.setting ="domestic";
        this.averageHeight=23;
        this.random = new Random(seed);
    }

    public String eat(){
        if((random.nextInt(2) + 1)==2)
            return "Purrrrrrr~ It will do I suppose";
        else
            return "Purrrrrrr";
    }

}
