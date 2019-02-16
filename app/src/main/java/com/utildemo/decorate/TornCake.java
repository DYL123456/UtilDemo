package com.utildemo.decorate;

/**
 * Created by ylding on 2019/2/16.
 */
public class TornCake extends Pancake {
    public TornCake() {
        desc = "手抓饼";
    }

    @Override
    public double price() {
        return 4;
    }
}
