
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNUncaughtExceptionReporterModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNUncaughtExceptionReporterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @ReactMethod
    public void listen(Callback callback) {
        callback.invoke("hello from android");
    }

    @Override
    public String getName() {
        return "RNUncaughtExceptionReporter";
    }
}