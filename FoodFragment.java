package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        List<Category> list = new ArrayList<>();
        Food.initFoodList(list, getContext());
        CategoryAdapter adapter =  new CategoryAdapter(getActivity(), list);
        View view = inflater.inflate(R.layout.category_list, container, false);
        ListView lv = view.findViewById(R.id.listView);
        lv.setAdapter(adapter);

        return view;
    }

}
