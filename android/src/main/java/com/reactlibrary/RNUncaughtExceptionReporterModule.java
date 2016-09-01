
package com.reactlibrary;

import android.util.Log;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.io.PrintWriter;
import java.io.StringWriter;

import static java.lang.Thread.getDefaultUncaughtExceptionHandler;
import static java.lang.Thread.setDefaultUncaughtExceptionHandler;

public class RNUncaughtExceptionReporterModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNUncaughtExceptionReporterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @ReactMethod
    public void listenToErrors(final Callback callback) {
        final Thread.UncaughtExceptionHandler exceptionHandler = getDefaultUncaughtExceptionHandler();

        setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable ex) {
                try {
                    Log.e("UncaughtException", "UncaughtException on " + thread, ex);

                    StringWriter errors = new StringWriter();
                    ex.printStackTrace(new PrintWriter(errors));
                    String text = errors.toString();

                    callback.invoke(text);
                } catch (Exception e) {
                    Log.e("UncaughtException", "Failed to report error", e);
                } finally {
                    exceptionHandler.uncaughtException(thread, ex);
                }
            }
        });
    }

    @Override
    public String getName() {
        return "RNUncaughtExceptionReporter";
    }
}