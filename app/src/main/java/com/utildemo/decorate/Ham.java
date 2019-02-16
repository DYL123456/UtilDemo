package com.utildemo.decorate;

/**
 * Created by ylding on 2019/2/16.
 */
public class Ham extends Condiment {
    Pancake pancake;
    public Ham(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc()+"火腿片";
    }

    @Override
    public double price() {
        return pancake.price()+1.5;
    }
}
