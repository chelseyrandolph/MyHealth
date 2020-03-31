package com.example.myhealth.ui.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhealth.MainMenu;
import com.example.myhealth.R;
import com.example.myhealth.ui.lifestyle.AddWorkout;

public class ExerciseLogActivity extends AppCompatActivity {
    Button addWorkoutButton, pastWorkoutsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_log);

        addWorkoutButton = findViewById(R.id.AddWorkout);
        addWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), AddWorkout.class);
                startActivityForResult(myIntent, 0);
            }
        });
        pastWorkoutsButton = findViewById(R.id.PastWorkouts);
        pastWorkoutsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), PastWorkout.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}

