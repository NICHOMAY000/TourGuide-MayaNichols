package com.example.android.tourguideapp;

import android.content.Context;

import java.util.List;

public class Museums {
    public static void MuseumList(List<Category> list, Context context){
        list.add(new Category(
                "Milwaukee Art Museum",
                "700 N Art Museum Drive, Milwaukee, Wisconsin",
                "The Milwaukee Art Museum collects and preserves art while presenting it to the public as a source of inspiration and education.",
                "414-224-3852",
                -1
        ));

        list.add(new Category(
                "Harley-Davidson Museum",
                "400 West Canal Street, Milwaukee, Wisconsin",
                "This museum about the Harley-Davidson Museum history so it features the Motorcycle Gallery, Harley Davidson journey, Engine room, Clubs and Competition, Tank Gallery, and Custom Culture.",
                "1-877-436-8738",
                -1
        ));

        list.add(new Category(
                "Discovery World",
                "500 N Harbor Drive, Milwaukee, WI",
                "Discovery World is a science and technology center.  The museum focuses on innovation and technology while contains interactive exhibits and theaters.",
                "414-765-9966",
                -1
        ));
        list.add(new Category(
                "Betty Brinn Children's Museum",
                "929 E Wisconsin Avenue, Milwaukee, WI",
                "This museum is dedicated to providing a hands-on experience that help children build cognitive, social, emotional, and physical skills.",
                "414-390-5437",
                -1
        ));
    }
}
