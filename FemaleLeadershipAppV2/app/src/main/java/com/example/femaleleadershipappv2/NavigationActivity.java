package com.example.femaleleadershipappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.femaleleadershipappv2.R;

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
