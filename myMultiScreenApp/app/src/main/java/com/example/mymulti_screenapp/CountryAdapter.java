package com.example.mymulti_screenapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryItem> {
    public CountryAdapter(Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.country_list_item, parent, false);
        CountryItem currentCountryItem = getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        TextView infectedTextView = convertView.findViewById(R.id.infectedTextView);
        TextView deathsTextView = convertView.findViewById(R.id.deathsTextView);
        TextView recoveredTextView = convertView.findViewById(R.id.recoveredTextView);

        nameTextView.setText(currentCountryItem.getName());
        infectedTextView.setText(currentCountryItem.getInfected());
        deathsTextView.setText(currentCountryItem.getDeaths());
        recoveredTextView.setText(currentCountryItem.getRecovered());

        return convertView;
    }
}
