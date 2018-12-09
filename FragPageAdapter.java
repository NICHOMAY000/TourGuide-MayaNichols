package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragPageAdapter extends FragmentPagerAdapter {
    Context Context;
    public FragPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        Context = context;
    }
    final int pageCount = 4;

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new SightsFragment();
        } else if (position==1){
            return new FoodFragment();
        } else if (position==2){
            return new MuseumsFragment();
        } else {
           return new ChurchesFragment();
        }
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Sights";
        } else if (position == 1) {
            return "Food";
        } else if (position == 2) {
            return "Museum";
        } else {
            return "Church";
        }

    }
}
