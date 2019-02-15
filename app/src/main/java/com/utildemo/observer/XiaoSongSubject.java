package com.utildemo.observer;

import android.widget.TextView;

import com.utildemo.interfac.Observer;
import com.utildemo.interfac.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ylding on 2019/2/15.
 */

//具体的被观察者类
public class XiaoSongSubject implements Subject {
    private List<Observer> observersList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (observersList.contains(observer)) {
            observersList.remove(observer);
        }

    }

    @Override
    public void notifyObesrver(String msg, TextView tv) {
        for (Observer observer1 : observersList) {
            observer1.update(msg, tv);
        }
    }
}
