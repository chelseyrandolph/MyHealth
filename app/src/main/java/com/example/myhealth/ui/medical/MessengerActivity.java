package com.example.myhealth.ui.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhealth.R;

public class MessengerActivity extends AppCompatActivity {
    Button button, messengerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);

        button = findViewById(R.id.newMessageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(v.getContext(), MessengerUI.class);
               startActivity(intent);
            }
        });

        messengerButton = findViewById(R.id.inboxButton);
        messengerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InboxScreen.class);
                startActivity(intent);
            }
        });
    }

}
