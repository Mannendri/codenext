package com.example.demorecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> contacts;
    private ListView list;
    private ContactAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts =  new ArrayList<Contact>();
        list = findViewById(R.id.items);

        contacts.add(new Contact("John Doe","1110100011",R.drawable.ic_launcher_background));
        contacts.add(new Contact("John Doe","1110100011",R.drawable.ic_launcher_background));
        contacts.add(new Contact("John Doe","1110100011",R.drawable.ic_launcher_background));
        contacts.add(new Contact("John Doe","1110100011",R.drawable.ic_launcher_background));
        contacts.add(new Contact("John Doe","1110100011",R.drawable.ic_launcher_background));
        contacts.add(new Contact("John Doe","1110100011",R.drawable.ic_launcher_background));
        contacts.add(new Contact("John Doe","1110100011",R.drawable.ic_launcher_background));

        myAdapter = new ContactAdapter(this,contacts);
        list.setAdapter(myAdapter);
    }
}
