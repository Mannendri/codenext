package com.example.android.spotifly;

public class CategoryItem {

    // Declare instance variables
    private String name;
    private int photo;

    // Constructor
    public CategoryItem(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
