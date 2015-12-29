package com.joy.logger;

import android.util.Log;

public class SLogger {

    public static final String LOG_PRE = "slogger/";
    private static boolean sDisable;
    private static String sPackageName;

    public static void init(String packageName, boolean disable) {
        sPackageName = packageName;
        sDisable = disable;
    }

    public static void v(String tag, String msg) {
        if (isDisable())
            return;

        Log.v(reallyTag(tag), msg);
    }

    public static void v(String tag, String format, Object... values) {
        if (isDisable())
            return;

        String msg = String.format(format, values);
        Log.v(reallyTag(tag), msg);
    }

    public static void v(String tag, String msg, Throwable throwable) {
        if (isDisable())
            return;

        Log.v(reallyTag(tag), msg, throwable);
    }

    public static void d(String tag, String msg) {
        if (isDisable())
            return;

        Log.d(reallyTag(tag), msg);
    }


    public static void d(String tag, String format, Object... values) {
        if (isDisable())
            return;

        String msg = String.format(format, values);
        Log.d(reallyTag(tag), msg);
    }

    public static void d(String tag, String msg, Throwable throwable) {
        if (isDisable())
            return;

        Log.d(reallyTag(tag), msg, throwable);
    }

    public static void i(String tag, String msg) {
        if (isDisable())
            return;

        Log.i(reallyTag(tag), msg);
    }


    public static void i(String tag, String format, Object... values) {
        if (isDisable())
            return;

        String msg = String.format(format, values);
        Log.i(reallyTag(tag), msg);
    }

    public static void i(String tag, String msg, Throwable throwable) {
        if (isDisable())
            return;

        Log.i(reallyTag(tag), msg, throwable);
    }

    public static void w(String tag, String msg) {
        if (isDisable())
            return;

        Log.w(reallyTag(tag), msg);
    }


    public static void w(String tag, String format, Object... values) {
        if (isDisable())
            return;

        String msg = String.format(format, values);
        Log.w(reallyTag(tag), msg);
    }

    public static void w(String tag, String msg, Throwable throwable) {
        if (isDisable())
            return;

        Log.w(reallyTag(tag), msg, throwable);
    }

    public static void e(String tag, String msg) {
        if (isDisable())
            return;

        Log.e(reallyTag(tag), msg);
    }



    public static void e(String tag, String format, Object... values) {
        if (isDisable())
            return;

        String msg = String.format(format, values);
        Log.e(reallyTag(tag), msg);
    }

    public static void e(String tag, String msg, Throwable throwable) {
        if (isDisable())
            return;

        Log.e(reallyTag(tag), msg, throwable);
    }

    public static boolean isDisable() {
        return sDisable;
    }

    private static String reallyTag(String tag) {
        return LOG_PRE + sPackageName + "/" + tag;
    }
}
