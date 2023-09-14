package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText atFahrenheit , atCelcius;
    TextView res;
    Double celcius , fahrenheit;

    Button b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atFahrenheit = findViewById(R.id.editTextNumber2);
        res = findViewById(R.id.fahren);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Double f = Double.parseDouble(atFahrenheit.getText().toString());
                    celcius =(f*1.8)+32;
                    res.setText(celcius+" ");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Double c = Double.parseDouble(atCelcius.getText().toString());
                    fahrenheit = (c-32)/1.8;
                    res.setText(fahrenheit+" ");
            }
        });
    }
}