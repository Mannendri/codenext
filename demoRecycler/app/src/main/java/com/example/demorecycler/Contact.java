package com.example.demorecycler;

public class Contact {
    // Declare instance variables
    private String name;
    private String phoneNumber;
    private int profilePic;

    // Constructor
    public Contact(String name, String phoneNumber, int profilePic) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.profilePic = profilePic;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }
}
