package com.utildemo.interfac;

import android.widget.TextView;

/**
 * Created by ylding on 2019/2/15.
 */
public interface Observer {
    public void update(String msg, TextView textView);
}
