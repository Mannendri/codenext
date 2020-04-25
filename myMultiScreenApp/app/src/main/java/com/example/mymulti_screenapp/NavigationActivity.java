package com.example.mymulti_screenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NavigationActivity extends AppCompatActivity {

    Button aboutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        aboutButton = findViewById(R.id.aboutButton);

    }

    public void openAboutActivity(View view) {
        Intent intentToOpenAboutActivity = new Intent(this, AboutActivity.class);
        startActivity(intentToOpenAboutActivity);
    }

    public void openPreventionActivity(View view) {
        Intent intentToOpenPreventionActivity = new Intent(this, PreventionActivity.class);
        startActivity(intentToOpenPreventionActivity);
    }

    public void openGameActivity(View view) {
        Intent intentToOpenGameActivity = new Intent(this, GameActivity.class);
        startActivity(intentToOpenGameActivity);

    }

    public void openStatisticsActivity(View view) {
        Intent intentToOpenStatisticsActivity = new Intent(this, StatisticsActivity.class);
        startActivity(intentToOpenStatisticsActivity);
    }
}
