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

public class PastWorkout extends AppCompatActivity {
    EditText OldWorkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_workouts);
        OldWorkout = findViewById(R.id.old_workout);
    }



}
