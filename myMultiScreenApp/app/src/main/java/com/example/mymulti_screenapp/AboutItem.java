package com.example.mymulti_screenapp;

import java.util.ArrayList;

public class AboutItem {
    String title;
    ArrayList<String> facts;
    int image;

    public AboutItem(String title, ArrayList<String> facts, int image) {
        this.title = title;
        this.facts = facts;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getFacts() {
        return facts;
    }

    public void setFacts(ArrayList<String> facts) {
        this.facts = facts;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
