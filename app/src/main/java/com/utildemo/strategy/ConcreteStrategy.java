package com.utildemo.strategy;

import android.widget.Toast;

import com.utildemo.MyApplication;
import com.utildemo.interfac.IStrategy;

/**
 * Created by ylding on 2019/2/14.
 */

//具体策略的实现
public class ConcreteStrategy implements IStrategy {
    @Override
    public void algorithMeth() {
        Toast.makeText(MyApplication.getContext(), "我实现了具体策略", Toast.LENGTH_LONG).show();
    }
}
