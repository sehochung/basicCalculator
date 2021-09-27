package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Divide extends AppCompatActivity {
    TextView textViewDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);
        textViewDivide = (TextView) findViewById(R.id.textViewAdd);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textViewDivide.setText("The answer is " + str);
    }
}