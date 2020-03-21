package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ArrayList<CategoryItem> albums = new ArrayList<CategoryItem>();
        albums.add(new CategoryItem("A Rush of Blood to the Head",R.drawable.blood));
        albums.add(new CategoryItem("Evolve",R.drawable.evolve));

        ListView albumListView = findViewById(R.id.albumListView);
        CategoryAdapter albumAdapter = new CategoryAdapter(this,albums);
        albumListView.setAdapter(albumAdapter);

    }
}
