package com.buglife.android.example;

import android.app.Application;

import com.buglife.sdk.Buglife;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // TODO: Replace `name@example.com` with your email to receive bug reports :)
        Buglife.setBuglifeUrl("http://192.168.178.53:8080/buglife");
        Buglife.initWithEmail(this, "name@example.com");
    }
}
