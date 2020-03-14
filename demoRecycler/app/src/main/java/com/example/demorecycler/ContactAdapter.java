package com.example.demorecycler;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact>{
    // Declare instance variables
    private Context myContext;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>;

    // Constructor
    public ContactAdapter(Context myContext, ArrayList<Contact>myContacts){
        super(myContext,0,myContacts);
        this.myContext = myContext;
        this.myContacts = myContacts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (myContacts == null){
            // This is a safeguard for your code crashing when there's nothing in the array list
            convertView = LayoutInflater.from(myContext).inflate(R.layout.contact_items,parent,false);
        }

        Contact currentContact = myContacts.get(position);

        ImageView profilePic = convertView.findViewById(R.id.profilePic);
        profilePic.setImageResource(currentContact.getProfilePic());
        TextView name = convertView.findViewById(R.id.name);
        name.setText(currentContact.getName());
        TextView phoneNumber = convertView.findViewById(R.id.phoneNumber);
        phoneNumber.setText(currentContact.getPhoneNumber());

        return convertView;
    }
}
