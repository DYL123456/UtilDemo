package com.utildemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by ylding on 2019/2/14.
 */
public class MyApplication extends Application {
    private static MyApplication mSelf;
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mSelf = this;
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
