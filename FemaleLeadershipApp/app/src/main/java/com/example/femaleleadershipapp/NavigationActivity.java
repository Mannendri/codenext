package com.example.femaleleadershipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
    }

    public void openQuizActivity(View view) {
        Intent intentToOpenQuizActivity = new Intent(this,QuizActivity.class);
        startActivity(intentToOpenQuizActivity);
    }
}
