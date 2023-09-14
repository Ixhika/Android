package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    CheckBox c1 , c2 , c3 , c4;
    Button b;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextNumber);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(c1.isChecked() && c2.isChecked() && c3.isChecked() && c4.isChecked()){
                        Toast.makeText(MainActivity.this,name.getText().toString()+" is suffering from covid",Toast.LENGTH_SHORT).show();
                    }
                    else if(c1.isChecked() && c2.isChecked() && c3.isChecked()){
                            Toast.makeText(MainActivity.this,name.getText().toString()+" is suffering from pneumonia",Toast.LENGTH_SHORT).show();
                        }
                    else if(c1.isChecked() && c2.isChecked()){
                        Toast.makeText(MainActivity.this,name.getText().toString()+" is suffering from viral fever",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, name.getText().toString()+"is suffering from cold and cough", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}