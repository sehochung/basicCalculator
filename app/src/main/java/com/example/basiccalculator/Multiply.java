package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Multiply extends AppCompatActivity {
    TextView textViewAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);
        textViewAdd = (TextView) findViewById(R.id.textViewMultiply);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textViewAdd.setText("The answer is " + str);
    }
}