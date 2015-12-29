package com.test;

import android.app.Application;

import com.joy.logger.SLogger;

import logger.joy.com.slogger.BuildConfig;

public class MyApplication extends Application {

    public static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        SLogger.init(BuildConfig.APPLICATION_ID, !BuildConfig.DEBUG);

        SLogger.i(TAG, "application start: package name: %s version code: %d version name: %s", BuildConfig.APPLICATION_ID, BuildConfig.VERSION_CODE, BuildConfig.VERSION_NAME);

        SLogger.i("A simple logger library.");
    }
}
