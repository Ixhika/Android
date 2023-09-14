package com.example.hackday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AdminLogin extends AppCompatActivity {
    EditText aname , apassword;
    Button lgin;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));

        aname = findViewById(R.id.email);
        apassword = findViewById(R.id.password);
        lgin = findViewById(R.id.button);
        img = findViewById(R.id.logo);

    }
}