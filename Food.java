package com.example.android.tourguideapp;

import android.content.Context;

import java.util.List;

public class Food {
    public static void initFoodList(List<Category> list, Context context){
        list.add(new Category(
                "Shark's Fish and Chicken",
                "5653 N 76th Street, Milwaukee, Wisconsin",
                "Late night comfort food.",
                "414-466-1455",
                -1
        ));

        list.add(new Category(
                "Carson's",
                "301 W Juneau, Milwaukee, Wisconsin",
                "Family owned, authentic, and classic dining experience.",
                "414-233-3311",
                -1
        ));

        list.add(new Category(
                "Hom Wood Fired Grill",
                "5750 N Port Washington Road, Glendale, Wisconsin",
                "Rustic, chic, farm to table restaurant with New American grilled meats, local beers with a patio.",
                "414-312-7043",
                -1
        ));
        list.add(new Category(
                "Firehouse Subs",
                "9070 N Green By Road, Brown Deer, WI",
                "Counter serve sandwich chain offering made-to-order hot and cold sandwiches, plus a variety of hot sauces.",
                "414-355-7827",
                -1
        ));
    }
}
