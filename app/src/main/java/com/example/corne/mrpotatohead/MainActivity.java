package com.example.corne.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        String clothing = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();
        ImageView image;

        if (clothing.equals("Arms")){
            image = (ImageView) findViewById(R.id.Arms);
        }
        else if (clothing.equals("Ears")){
            image = (ImageView) findViewById(R.id.Ears);
        }
        else if (clothing.equals("Eyebrows")){
            image = (ImageView) findViewById(R.id.Eyebrows);
        }
        else if (clothing.equals("Eyes")){
            image = (ImageView) findViewById(R.id.Eyes);
        }
        else if (clothing.equals("Hat")){
            image = (ImageView) findViewById(R.id.Hat);
        }
        else if (clothing.equals("Mustache")){
            image = (ImageView) findViewById(R.id.Mustache);
        }
        else if (clothing.equals("Glasses")){
            image = (ImageView) findViewById(R.id.Glasses);
        }
        else if (clothing.equals("Mouth")){
            image = (ImageView) findViewById(R.id.Mouth);
        }
        else if (clothing.equals("Nose")) {
            image = (ImageView) findViewById(R.id.Nose);
        }
        else{
            image = (ImageView) findViewById(R.id.Shoes);
        }

        if (checked){
            image.setVisibility(View.VISIBLE);
        }
        else{
            image.setVisibility(View.INVISIBLE);
        }

    }

}
