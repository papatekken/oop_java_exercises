package com.techreturners.cats;

public class CheetahCat extends CatImpl{

    public CheetahCat(){
        this.asleep= false;
        this.setting ="wild";
        this.averageHeight=800;
    }

    public String eat(){
        return "Zzzzzzz";
    }


}
