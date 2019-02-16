package com.utildemo.decorate;

/**
 * Created by ylding on 2019/2/16.
 */
public class FiredEgg extends Condiment {
    private Pancake pancake;

    public FiredEgg(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + "煎蛋";
    }

    @Override
    public double price() {
        return pancake.price()+2;
    }
}
