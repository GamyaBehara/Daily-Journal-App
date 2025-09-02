package com.example.project_1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private LinearLayout entryContainer;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        entryContainer = findViewById(R.id.entryContainer);
        addButton = findViewById(R.id.addButton);

        // Load and display entries
        loadEntries();

        // Open AddEntryActivity on button click
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddEntryActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Refresh the entries when returning from AddEntryActivity
        loadEntries();
    }

    private void loadEntries() {
        // Clear existing entries
        entryContainer.removeAllViews();

        // Load entries from SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("DiaryEntries", MODE_PRIVATE);
        Set<String> entrySet = sharedPreferences.getStringSet("entries", new HashSet<>());

        // Display each entry
        for (String entry : entrySet) {
            // Split the entry into title, text, and imageId
            String[] parts = entry.split("\\|");

            // Validate the parts array
            if (parts.length >= 3) { // Ensure there are at least 3 parts
                String title = parts[0];
                String text = parts[1];
                int imageId = Integer.parseInt(parts[2]);

                // Create a new entry view
                View entryView = getLayoutInflater().inflate(R.layout.entry_item, entryContainer, false);

                // Set title
                TextView titleView = entryView.findViewById(R.id.entryTitle);
                titleView.setText(title);

                // Set text
                TextView textView = entryView.findViewById(R.id.entryText);
                textView.setText(text);

                // Set image
                ImageView imageView = entryView.findViewById(R.id.entryImage);
                imageView.setImageResource(imageId);

                // Add the entry view to the container
                entryContainer.addView(entryView);
            } else {
                // Log invalid entries
                Log.e("MainActivity", "Invalid entry format: " + entry);
            }
        }
    }
}