package com.tabdemo.tablayout;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.tabdemo.R;

public class Tab1Fragment extends Fragment {
    FragmentManager fragmentManager;

    public Tab1Fragment(FragmentManager fm)
    {
        fragmentManager = fm;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Fragment fragment = new ReactFragment.Builder("HelloWorld").build();

        fragmentManager
                .beginTransaction()
                .add(R.id.container_main, fragment)
                .commit();

        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}
