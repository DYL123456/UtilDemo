package com.utildemo.activity;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ylding on 2019/2/13.
 */
public class DelayTimeFuncationActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //延时的第一个方法
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
