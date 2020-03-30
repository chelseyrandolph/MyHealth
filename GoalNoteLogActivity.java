package com.example.myhealth.ui.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhealth.R;

public class GoalNoteLogActivity extends AppCompatActivity {
    Button addGoal, viewProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_note_log);

        addGoal = findViewById(R.id.newGoal);
        addGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), AddGoal.class);
                startActivityForResult(myIntent, 0);
            }
        });
        viewProgress = findViewById(R.id.Progress);
        viewProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), PastWorkout.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
