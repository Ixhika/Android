package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

public class Contact extends AppCompatActivity {

    EditText t1 , t2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.DarkBlue));

        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);


    }
}