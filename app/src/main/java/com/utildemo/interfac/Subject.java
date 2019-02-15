package com.utildemo.interfac;

import android.widget.TextView;

/**
 * Created by ylding on 2019/2/15.
 */
public interface Subject {
    //增加观察者
    public void addObserver(Observer observer);

    //删除观察者
    public void deleteObserver(Observer observer);

    //通知观察者
    public void notifyObesrver(String msg, TextView tv);

}
