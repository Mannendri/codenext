package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<CategoryItem> artists = new ArrayList<CategoryItem>();
        artists.add(new CategoryItem("Kid Cudi",R.drawable.cudi));
        artists.add(new CategoryItem("Gunna",R.drawable.gunna));
        artists.add(new CategoryItem("Rihanna",R.drawable.rihanna));
        artists.add(new CategoryItem("YoungBoy",R.drawable.youngboy));

        ListView artistListView = findViewById(R.id.artistListView);
        CategoryAdapter artistAdapter = new CategoryAdapter(this, artists);
        artistListView.setAdapter(artistAdapter);
    }
}
