package com.tabdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativenavigation.NavigationActivity;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;
import com.reactnativenavigation.react.ReactGateway;

public class MainActivity extends NavigationActivity {


    public String name = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = "Ram";
            System.out.println("getting into bundele");
            WritableMap params = Arguments.createMap();
            params.putString("title", "hello");

            if (getReactGateway().getReactNativeHost().getReactInstanceManager().getCurrentReactContext() != null) {
                System.out.println("I am Inn.........");
                getReactGateway().getReactNativeHost().getReactInstanceManager().getCurrentReactContext()
                        .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("onReceived", params);
            } else {

            }

        }
    }


}
