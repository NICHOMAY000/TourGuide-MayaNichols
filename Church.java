package com.example.android.tourguideapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Church {

    public static void iniChurchList(List<Category> list, Context context){
        list.add(new Category(
                "Solomon's Temple Evangelistic Ministries",
                "2207 W Center Street",
                "Nondenominational",
                "414-585-9039",
                -1
        ));

        list.add(new Category(
                "Philadelphia Baptist Church",
                "2028 W Cherry Street, Milwaukee, WI",
                "Baptist",
                "414-344-2400",
                -1
        ));

        list.add(new Category(
                "Greater New Birth",
                "8237 W Silver Spring Drive, Milwaukee, WI",
                "Christian",
                "414-264-5683",
                -1
        ));
        list.add(new Category(
                "Parklawn Assembly of God Church",
                "3725 N Sherman Blvd, Milwaukee, WI",
                "Christian",
                "414-442-7411",
                -1
        ));
    }
}
