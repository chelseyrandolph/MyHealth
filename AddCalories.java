package com.example.myhealth.ui.lifestyle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myhealth.MainMenu;
import com.example.myhealth.R;
import com.example.myhealth.LifestyleFragment;

public class AddCalories extends AppCompatActivity {
    EditText newCalories;
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
        newCalories = findViewById(R.id.new_Calories);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), FoodWaterLogActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }



}
