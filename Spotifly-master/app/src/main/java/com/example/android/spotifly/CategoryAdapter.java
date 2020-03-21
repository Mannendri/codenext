package com.example.android.spotifly;

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

public class CategoryAdapter extends ArrayAdapter<CategoryItem> {
    public CategoryAdapter(Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        CategoryItem currentCategoryItem = getItem(position);

        ImageView categoryItemImageView = convertView.findViewById(R.id.list_item_photo);
        TextView categoryItemTextView = convertView.findViewById(R.id.list_item_name);
        categoryItemImageView.setImageResource(currentCategoryItem.getPhoto());
        categoryItemTextView.setText(currentCategoryItem.getName());

        return convertView;

    }
}
