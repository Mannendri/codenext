package com.example.femaleleadershipappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.femaleleadershipappv2.R;

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
