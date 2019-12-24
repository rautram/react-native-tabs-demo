package com.tabdemo.tablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.ReactFragment;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.google.android.material.tabs.TabLayout;
import com.reactnativenavigation.NavigationActivity;
import com.tabdemo.MainActivity;
import com.tabdemo.R;
import com.tabdemo.pager.SimplePagerAdapter;

public class TabViewActivity extends NavigationActivity implements DefaultHardwareBackBtnHandler {

   private ViewPager viewPager;
   private TabLayout tabLayout;
   private TabAdapter tabAdapter;
   ReactFragment firstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_view);

            viewPager = (ViewPager) findViewById(R.id.viewpager);
            tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
            SimplePagerAdapter adapter = new SimplePagerAdapter(getSupportFragmentManager());
            viewPager.setAdapter(adapter);
            tabLayout.setupWithViewPager(viewPager);

    }


    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    @NonNull
    @Override
    public FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }
}
