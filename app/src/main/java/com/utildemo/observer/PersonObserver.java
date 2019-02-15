package com.utildemo.observer;

import android.widget.TextView;

import com.utildemo.interfac.Observer;

/**
 * Created by ylding on 2019/2/15.
 */
public class PersonObserver implements Observer {
    private String name;

    public PersonObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg, TextView textView) {
        textView.setText("name:" + name + msg + "\n");
    }
}
