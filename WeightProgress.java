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

public class WeightProgress extends AppCompatActivity {
    EditText weightFluct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_progress);
        weightFluct = findViewById(R.id.weight_track);
    }



}
