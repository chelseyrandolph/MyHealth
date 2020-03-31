package com.example.myhealth.ui.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhealth.R;

public class WeightLogActivity extends AppCompatActivity {
    Button newWeight, progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_log);


        newWeight = findViewById(R.id.AddNewWeight);
        newWeight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // sets the intent as the page you want to bring up when clicked
            Intent myIntent = new Intent(v.getContext(), WeightEntry.class);
            startActivityForResult(myIntent, 0);
                }
        });
        progress = findViewById(R.id.ViewProgress);
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sets the intent as the page you want to bring up when clicked
                Intent myIntent = new Intent(v.getContext(), WeightProgress.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
