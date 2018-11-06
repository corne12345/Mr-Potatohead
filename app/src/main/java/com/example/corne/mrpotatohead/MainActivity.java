package com.example.corne.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView armsIV, earsIV, eyebrowsIV, eyesIV, glassesIV, hatIV, mouthIV, mustacheIV, noseIV, shoesIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            (findViewById(R.id.Arms)).setVisibility(savedInstanceState.getInt("arms"));
            (findViewById(R.id.Ears)).setVisibility(savedInstanceState.getInt("ears"));
            (findViewById(R.id.Eyebrows)).setVisibility(savedInstanceState.getInt("eyebrows"));
            (findViewById(R.id.Eyes)).setVisibility(savedInstanceState.getInt("eyes"));
            (findViewById(R.id.Glasses)).setVisibility(savedInstanceState.getInt("glasses"));
            (findViewById(R.id.Hat)).setVisibility(savedInstanceState.getInt("hat"));
            (findViewById(R.id.Mouth)).setVisibility(savedInstanceState.getInt("mouth"));
            (findViewById(R.id.Mustache)).setVisibility(savedInstanceState.getInt("mustache"));
            (findViewById(R.id.Nose)).setVisibility(savedInstanceState.getInt("nose"));
            (findViewById(R.id.Shoes)).setVisibility(savedInstanceState.getInt("shoes"));
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("arms", (findViewById(R.id.Arms)).getVisibility());
        outState.putInt("ears", (findViewById(R.id.Ears)).getVisibility());
        outState.putInt("eyebrows", (findViewById(R.id.Eyebrows)).getVisibility());
        outState.putInt("eyes", (findViewById(R.id.Eyes)).getVisibility());
        outState.putInt("glasses", (findViewById(R.id.Glasses)).getVisibility());
        outState.putInt("hat", (findViewById(R.id.Hat)).getVisibility());
        outState.putInt("mouth", (findViewById(R.id.Mouth)).getVisibility());
        outState.putInt("mustache", (findViewById(R.id.Mustache)).getVisibility());
        outState.putInt("nose", (findViewById(R.id.Nose)).getVisibility());        outState.putInt("glasses", (findViewById(R.id.Glasses)).getVisibility());
        outState.putInt("shoes", (findViewById(R.id.Shoes)).getVisibility());
    }

    //
    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String clothing = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();
        ImageView image;

        switch (clothing) {
            case "Arms":
                armsIV = findViewById(R.id.Arms);
                if (checked) {
                    armsIV.setVisibility(View.VISIBLE);
                } else {
                    armsIV.setVisibility(View.INVISIBLE);
                }
            case "Ears":
                earsIV = findViewById(R.id.Ears);
                if (checked) {
                    earsIV.setVisibility(View.VISIBLE);
                } else {
                    earsIV.setVisibility(View.INVISIBLE);
                }
            case "Eyebrows":
                eyebrowsIV = findViewById(R.id.Eyebrows);
                if (checked) {
                    eyebrowsIV.setVisibility(View.VISIBLE);
                } else {
                    eyebrowsIV.setVisibility(View.INVISIBLE);
                }
            case "Eyes":
                eyesIV = findViewById(R.id.Eyes);
                if (checked) {
                    eyesIV.setVisibility(View.VISIBLE);
                } else {
                    eyesIV.setVisibility(View.INVISIBLE);
                }
            case "Glasses":
                glassesIV = findViewById(R.id.Glasses);
                if (checked) {
                    glassesIV.setVisibility(View.VISIBLE);
                } else {
                    glassesIV.setVisibility(View.INVISIBLE);
                }
            case "Hat":
                hatIV = findViewById(R.id.Hat);
                if (checked) {
                    hatIV.setVisibility(View.VISIBLE);
                } else {
                    hatIV.setVisibility(View.INVISIBLE);
                }
            case "Mouth":
                mouthIV = findViewById(R.id.Mouth);
                if (checked) {
                    mouthIV.setVisibility(View.VISIBLE);
                } else {
                    mouthIV.setVisibility(View.INVISIBLE);
                }
            case "Mustache":
                mustacheIV = findViewById(R.id.Mustache);
                if (checked) {
                    mustacheIV.setVisibility(View.VISIBLE);
                } else {
                    mustacheIV.setVisibility(View.INVISIBLE);
                }
            case "Nose":
                noseIV = findViewById(R.id.Nose);
                if (checked) {
                    noseIV.setVisibility(View.VISIBLE);
                } else {
                    noseIV.setVisibility(View.INVISIBLE);
                }
            case "Shoes":
                shoesIV = findViewById(R.id.Shoes);
                if (checked) {
                    shoesIV.setVisibility(View.VISIBLE);
                } else {
                    shoesIV.setVisibility(View.INVISIBLE);
                }
        }
    }
}