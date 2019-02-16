package com.utildemo.decorate;

/**
 * Created by ylding on 2019/2/16.
 */
public class Roujiamo extends Pancake {
    public Roujiamo() {
        desc = "肉夹馍";
    }

    @Override
    public double price() {
        return 6;
    }
}
