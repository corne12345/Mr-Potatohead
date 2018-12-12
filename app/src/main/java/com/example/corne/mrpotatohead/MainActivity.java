package com.example.corne.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    // Global list of names of all the items (both in text as in ImageView id's)
    public String itemNames[] = {"Arms", "Ears", "Eyebrows", "Eyes", "Glasses", "Hat", "Mouth", "Mustache", "Nose", "Shoes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load states if present
        if (savedInstanceState != null) {

            // Loop over the list of item names
            for (int i = 0; i < itemNames.length; i++) {

                // Get R.id of every item and set its visibility according to saved state
                int resID = getResources().getIdentifier(itemNames[i], "id", getPackageName());
                (findViewById(resID)).setVisibility(savedInstanceState.getInt(itemNames[i]));
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Loop over the list of all the items
        for (int i = 0; i < itemNames.length; i++){

            // Get all Rid's of imageviews and save its visibility
            int resID = getResources().getIdentifier(itemNames[i], "id", getPackageName());
            outState.putInt(itemNames[i], (findViewById(resID)).getVisibility());
        }
    }

    // Method that is activated, when a checkbox is clicked
    public void checkClicked(View v) {

        // collect variables of this instance for further use
        CheckBox checkbox = (CheckBox) v;
        String clothing = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();

        // Loop over all the bodypart names
        for (int i = 0; i < itemNames.length; i++) {

            // When a match is found between bodypart and checked box
            if (itemNames[i].equals(clothing)) {

                // Match checkbox to imagaview of this bodypart
                int resID = getResources().getIdentifier(itemNames[i], "id", getPackageName());
                ImageView clickedItem = (ImageView) findViewById(resID);

                // Change visibility basedd on whether or not box is checked
                if (checked) {
                    clickedItem.setVisibility(View.VISIBLE);
                } else {
                    clickedItem.setVisibility(View.INVISIBLE);
                }
            }
        }
    }
}
