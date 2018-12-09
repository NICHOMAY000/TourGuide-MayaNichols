package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends ArrayAdapter {

    public CategoryAdapter(Activity context, List<Category> categories) {
        super(context, 0, categories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Category category = (Category) getItem(position);
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.catefory_list_item, parent, false);
        }

        TextView nameLocationTextView = listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(category.getName());

        TextView descriptionLocationTextView = listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(category.getDescription());

        TextView addressLocationTextView = listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(category.getAddress());


        TextView phoneLocationTextView = listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(category.getPhoneNum());

        ImageView photoLocationImageView = listItemView.findViewById(R.id.photoImageView);

        if (category.hasImage()){
            photoLocationImageView.setImageResource(category.getImageResourceId());
            phoneLocationTextView.setVisibility(View.VISIBLE);

        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        if (category.hasAddress()){
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        if (category.hasPhone()){
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
