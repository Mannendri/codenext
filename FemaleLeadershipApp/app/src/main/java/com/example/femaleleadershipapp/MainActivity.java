package com.example.femaleleadershipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNavigationActivity(View view) {
        Intent intentToOpenNavigationActivity = new Intent(this,NavigationActivity.class);
        startActivity(intentToOpenNavigationActivity);
    }
}
