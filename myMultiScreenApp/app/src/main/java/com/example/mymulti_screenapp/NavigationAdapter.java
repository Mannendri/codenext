package com.example.mymulti_screenapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NavigationAdapter extends ArrayAdapter<NavigationItem> {
    public NavigationAdapter(Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.navigation_list_item, parent, false);
        NavigationItem currentNavigationItem = getItem(position);

        ImageView navigationItemImageView = convertView.findViewById(R.id.list_item_image);
        TextView navigationItemTextView = convertView.findViewById(R.id.list_item_name);
        navigationItemImageView.setImageResource(currentNavigationItem.getImage());
        navigationItemTextView.setText(currentNavigationItem.getName());

        return convertView;

    }
}

