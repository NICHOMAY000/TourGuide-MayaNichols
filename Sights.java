package com.example.android.tourguideapp;

import android.content.Context;

import java.util.List;

public class Sights {
    public static void SightsList(List<Category> list, Context context){
        list.add(new Category(
                context.getString(R.string.SightSee1Name),
                context.getString(R.string.SightSee1Des),
                "", "",
                R.drawable.mitchellpark
        ));

        list.add(new Category(
                context.getString(R.string.SightSee2Name),
                context.getString(R.string.SightSee2Des),
                "", "",
                R.drawable.thirdward
        ));

        list.add(new Category(
                context.getString(R.string.SightSee3Name),
                context.getString(R.string.SightSee3Des),
                "",
                "",
                R.drawable.millerpark
        ));
        list.add(new Category(
                context.getString(R.string.SightSee4Name),
                context.getString(R.string.SightSee4Des),
                "",
                "",
                R.drawable.bradfordbeach
        ));
    }
}
