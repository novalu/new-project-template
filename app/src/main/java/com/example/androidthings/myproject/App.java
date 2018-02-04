package com.example.androidthings.myproject;

import android.app.Application;
import android.view.Display;

import com.google.android.things.device.ScreenManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ScreenManager mng = new ScreenManager(Display.DEFAULT_DISPLAY);
        mng.lockRotation(ScreenManager.ROTATION_90);
    }
}
