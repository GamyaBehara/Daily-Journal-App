package com.example.project_1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class ImageSpinnerAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<Drawable> images;
    private ArrayList<String> names;

    public ImageSpinnerAdapter(Context context, ArrayList<Drawable> images, ArrayList<String> names) {
        super(context, android.R.layout.simple_spinner_item, names);
        this.context = context;
        this.images = images;
        this.names = names;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    private View getCustomView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_spinner_row, parent, false);

        ImageView imageView = row.findViewById(R.id.spinner_image);
        TextView textView = row.findViewById(R.id.spinner_text);

        imageView.setImageDrawable(images.get(position));
        textView.setText(names.get(position));

        return row;
    }
}