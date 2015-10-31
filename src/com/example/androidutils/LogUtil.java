package com.example.androidutils;

import android.util.Log;

/**
 * Control the level of log print
 * @author hdfy
 */
public class LogUtil {

    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;
    private static final int DEFAULT = VERBOSE; // DEFAULT = NOTHING : print nothing

    public static void v(String tag, String msg) {
        if (DEFAULT <= VERBOSE) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (DEFAULT <= DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (DEFAULT <= INFO) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (DEFAULT <= WARN) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (DEFAULT <= ERROR) {
            Log.e(tag, msg);
        }
    }
}
