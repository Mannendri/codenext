package com.example.mymulti_screenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        ArrayList<NavigationItem> navigationItems = new ArrayList<NavigationItem>();
        navigationItems.add(new NavigationItem("What is COVID-19?",R.drawable.cudi));
        navigationItems.add(new NavigationItem("What should you be doing?",R.drawable.gunna));
        navigationItems.add(new NavigationItem("Important Data",R.drawable.rihanna));
        navigationItems.add(new NavigationItem("Play Game",R.drawable.youngboy));

        ListView artistListView = findViewById(R.id.navigationListView);
        NavigationAdapter navigationAdapter = new NavigationAdapter(this, navigationItems);
        artistListView.setAdapter(navigationAdapter);
    }
}
