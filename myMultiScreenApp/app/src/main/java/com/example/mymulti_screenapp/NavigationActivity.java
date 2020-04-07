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
        navigationItems.add(new NavigationItem("About COVID-19","Go",R.drawable.ic_launcher_background));
        navigationItems.add(new NavigationItem("Protect Yourself","Go",R.drawable.ic_launcher_background));
        navigationItems.add(new NavigationItem("Statistics","Go",R.drawable.ic_launcher_background));
        navigationItems.add(new NavigationItem("Play Game","Go",R.drawable.ic_launcher_background));

        ListView navigationListView = findViewById(R.id.navigationListView);
        NavigationAdapter navigationAdapter = new NavigationAdapter(this, navigationItems);
        navigationListView.setAdapter(navigationAdapter);
    }
}
