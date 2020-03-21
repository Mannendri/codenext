package com.example.android.spotifly;

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

    public void openArtistActivity(View view) {
        Intent intentToOpenArtistActivity = new Intent(this, ArtistActivity.class);
        startActivity(intentToOpenArtistActivity);
    }

    public void openAlbumActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, AlbumActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }
}
