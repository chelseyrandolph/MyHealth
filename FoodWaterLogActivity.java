package com.example.myhealth.ui.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhealth.MainMenu;
import com.example.myhealth.R;

public class FoodWaterLogActivity extends AppCompatActivity {
    Button CalorieIntake, follow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_water_log);

        CalorieIntake = findViewById(R.id.AddCalories);
        CalorieIntake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), AddCalories.class);
                startActivityForResult(myIntent, 0);
            }
        });
        follow = findViewById(R.id.TrackCalories);
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), CalorieCounter.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}