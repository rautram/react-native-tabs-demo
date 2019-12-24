package com.tabdemo.pager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.tabdemo.R;
import com.tabdemo.tablayout.ReactFragment;
import com.tabdemo.tablayout.Tab1Fragment;
import com.tabdemo.tablayout.Tab2Fragment;

public class SimplePagerAdapter extends FragmentPagerAdapter {


     FragmentManager fragmentManager;



    public SimplePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragmentManager = fm;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position == 0) {
            return new Tab1Fragment(fragmentManager);
        }
        else {
            return  new Tab2Fragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "ONE";
            case 1:
                return "TWO";
            default:
                return null;
        }
    }


}
