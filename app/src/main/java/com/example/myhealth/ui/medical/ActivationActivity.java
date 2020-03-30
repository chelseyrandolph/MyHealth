package com.example.myhealth.ui.medical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myhealth.MainMenu;
import com.example.myhealth.R;

public class ActivationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation);
        System.out.println("Test");
        final Button activateBtn = findViewById(R.id.activateBtn);
        final EditText dob = findViewById(R.id.dobFld);
        final EditText ssn = findViewById(R.id.ssnFld);
        dob.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                System.out.println(event.getKeyCode());
                if(event.getKeyCode() != KeyEvent.KEYCODE_ENTER) return false;
                InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                //mgr.hideSoftInputFromWindow(v.getWindowToken(), 0);
                mgr.showSoftInput(ssn,InputMethodManager.SHOW_FORCED);
                return true;
            }
        });

        ssn.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(event.getKeyCode() != KeyEvent.KEYCODE_ENTER) return false;
                InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                mgr.hideSoftInputFromWindow(v.getWindowToken(), 0);
                return true;
            }
        });

        activateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
