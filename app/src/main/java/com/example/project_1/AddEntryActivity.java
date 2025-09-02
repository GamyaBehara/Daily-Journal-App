package com.example.project_1;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AddEntryActivity extends AppCompatActivity {

    private EditText titleInput, textArea;
    private Spinner imageSpinner;
    private Button saveButton;
    private int[] imageIds; // Array to store image resource IDs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);

        titleInput = findViewById(R.id.titleInput);
        textArea = findViewById(R.id.textArea);
        imageSpinner = findViewById(R.id.imageSpinner);
        saveButton = findViewById(R.id.saveButton);

        // Load images and names from resources
        ArrayList<Drawable> images = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        // Get image resource IDs and names from arrays.xml
        imageIds = new int[]{
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5
        };
        String[] imageNames = getResources().getStringArray(R.array.predefined_image_names);

        // Populate the images and names lists
        for (int id : imageIds) {
            images.add(getResources().getDrawable(id));
        }
        for (String name : imageNames) {
            names.add(name);
        }

        // Set up custom adapter for the Spinner
        ImageSpinnerAdapter adapter = new ImageSpinnerAdapter(this, images, names);
        imageSpinner.setAdapter(adapter);

        // Save entry and return to MainActivity
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleInput.getText().toString();
                String text = textArea.getText().toString();
                int selectedImageId = imageIds[imageSpinner.getSelectedItemPosition()]; // Get the selected image ID

                if (title.isEmpty() || text.isEmpty()) {
                    Toast.makeText(AddEntryActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Save entry to SharedPreferences
                    SharedPreferences sharedPreferences = getSharedPreferences("DiaryEntries", MODE_PRIVATE);
                    Set<String> entrySet = sharedPreferences.getStringSet("entries", new HashSet<>());

                    // Format: "title|text|imageId"
                    String entry = title + "|" + text + "|" + selectedImageId;
                    entrySet.add(entry);

                    sharedPreferences.edit().putStringSet("entries", entrySet).apply();

                    // Return to MainActivity
                    finish();
                }
            }
        });
    }
}