package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int first = Integer.parseInt(myTextField.getText().toString());
        int second = Integer.parseInt(myTextField2.getText().toString());

        int answer = first+second;

        goToAdd(String.valueOf(answer));

    }

    public void goToAdd(String s) {
        Intent intent = new Intent(this, Add.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void subtractFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int first = Integer.parseInt(myTextField.getText().toString());
        int second = Integer.parseInt(myTextField2.getText().toString());

        int answer = first-second;

        goToSubtract(String.valueOf(answer));

    }
    public void goToSubtract(String s) {
        Intent intent = new Intent(this, Add.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void multiplyFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int first = Integer.parseInt(myTextField.getText().toString());
        int second = Integer.parseInt(myTextField2.getText().toString());

        int answer = first*second;

        goToMultiply(String.valueOf(answer));

    }
    public void goToMultiply(String s) {
        Intent intent = new Intent(this, Add.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void divideFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int first = Integer.parseInt(myTextField.getText().toString());
        int second = Integer.parseInt(myTextField2.getText().toString());

        int answer = first/second;

        goToDivide(String.valueOf(answer));

    }
    public void goToDivide(String s) {
        Intent intent = new Intent(this, Add.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}