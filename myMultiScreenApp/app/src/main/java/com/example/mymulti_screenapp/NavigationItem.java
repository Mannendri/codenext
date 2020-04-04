package com.example.mymulti_screenapp;

public class NavigationItem {
    String name;
    String buttonText;
    int image;

    public NavigationItem(String name, String buttonText, int image) {
        this.name = name;
        this.buttonText = buttonText;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
