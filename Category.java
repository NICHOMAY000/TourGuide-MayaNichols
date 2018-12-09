package com.example.android.tourguideapp;

import android.util.Log;

public class Category {
    private String Name;
    private String Description;
    private String Address;
    private String PhoneNum;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int ImageResourceId = NO_IMAGE_PROVIDED;


    public Category(String Name, String Description, String Address, String PhoneNum, int ImageResourceId) {
        this.Name = Name;
        this.Description = Description;
        this.Address = Address;
        this.PhoneNum = PhoneNum;
        this.ImageResourceId = ImageResourceId;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() { return Description; }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }


    public int getImageResourceId() {
        return ImageResourceId;
    }

    public boolean hasImage() {
        Log.v("hasImage", "word has image: " + (ImageResourceId != NO_IMAGE_PROVIDED));
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPhone() {
        return getPhoneNum() != null;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhoneNum() + "\n" +
                getImageResourceId();
        return output;

    }
}
