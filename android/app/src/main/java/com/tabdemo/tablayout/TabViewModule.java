package com.tabdemo.tablayout;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.ReactGateway;

public class TabViewModule extends ReactContextBaseJavaModule {

    Context context;

    public TabViewModule(@NonNull ReactApplicationContext reactContext) {

        super(reactContext);
        context = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return "TabView";
    }

    @ReactMethod
    public void startTabActivity()
    {
        final ReactGateway reactGateway = NavigationApplication.instance.getReactGateway();
        AppCompatActivity appCompatActivity = (AppCompatActivity) getCurrentActivity();
        Intent intent = new Intent(appCompatActivity, TabViewActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        appCompatActivity.startActivity(intent);

    }

}
