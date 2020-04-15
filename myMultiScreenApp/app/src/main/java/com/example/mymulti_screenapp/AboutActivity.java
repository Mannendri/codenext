package com.example.mymulti_screenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayList<AboutItem> info = new ArrayList<AboutItem>();
        info.add(new AboutItem("Kid Cudi",R.drawable.cudi));
        info.add(new AboutItem("Gunna",R.drawable.gunna));
        info.add(new AboutItem("Rihanna",R.drawable.rihanna));
        info.add(new AboutItem("YoungBoy",R.drawable.youngboy));

        ListView aboutListView = findViewById(R.id.aboutListView);
        AboutAdapter aboutAdapter = new AboutAdapter(this, info);
        aboutListView.setAdapter(aboutAdapter);
    }
}
