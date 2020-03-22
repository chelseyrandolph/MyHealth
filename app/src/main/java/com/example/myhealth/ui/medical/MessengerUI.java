package com.example.myhealth.ui.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myhealth.R;

import java.util.concurrent.TimeUnit;

public class MessengerUI extends AppCompatActivity {

    Button sendButton;
    TextView replyMessageTextView, doctorMessage, replyMessageTextView2, doctorMessage2;
    EditText message_editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger_ui);
        replyMessageTextView = findViewById(R.id.replyMessageTextView);
        message_editText = findViewById(R.id.message_editText);
        doctorMessage = findViewById(R.id.doctorMessageTextView);
        sendButton = findViewById(R.id.sendButton);
        doctorMessage2 = findViewById(R.id.doctorMessageTextView2);
        replyMessageTextView2 = findViewById(R.id.replyMessageTextView2);

        sendButton.setOnClickListener(new View.OnClickListener() {
        int click = 0;
            @Override
            public void onClick(View v) {
                switch(click){
                    case 0: String message = message_editText.getText().toString();
                            replyMessageTextView.setText(message);
                            message_editText.setText("");
                            doctorMessage.setText("Can you confirm your patient ID?");
                            click += 1;
                            break;
                    case 1:String message2 = message_editText.getText().toString();
                            replyMessageTextView2.setText(message2);
                            message_editText.setText("");
                            doctorMessage2.setText("Thank you, what would you like to discus today?");
                            click += 1;
                }


            }
        });
    }

}


