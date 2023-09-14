package com.example.calulator_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    TextView t1;
    Button b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    float val1 , val2, res;
    Boolean sum,min,div,mul;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextNumber);
        t1 = findViewById(R.id.textView3);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button12);
        b3 = findViewById(R.id.button3);
       b4 = findViewById(R.id.bsum);
        b5 = findViewById(R.id.b4);
        b6 = findViewById(R.id.b5);
        b7 = findViewById(R.id.b6);
        b8 = findViewById(R.id.bminus);
        b9 = findViewById(R.id.b7);
        b10 = findViewById(R.id.b8);
        b11 = findViewById(R.id.b9);
        b12 = findViewById(R.id.bmul);
        b13 = findViewById(R.id.bclear);
        b14 = findViewById(R.id.b0);
        b15 = findViewById(R.id.bequal);
        b16 = findViewById(R.id.bdiv);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               e1.setText(e1.getText().toString()+"1");
           }
       });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(e1.getText().toString());
                e1.setText("");
                sum = true;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"4");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"5");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"6");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(e1.getText().toString());
                e1.setText("");
                min = true;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"7");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"8");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"9");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(e1.getText().toString());
                e1.setText("");
                mul = true;
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText().toString()+"0");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(e1.getText().toString());
                e1.setText("");
                div =  true;
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum == true) {
                    val2 = Float.parseFloat(e1.getText().toString());
                    res = val1 + val2;
                    String textview3 = String.valueOf(res);
                    t1.setText(textview3);
                    sum = false;
                }
                else if(min == true){
                    val2 = Float.parseFloat(e1.getText().toString());
                    res = val1 - val2;
                    String textview3 = String.valueOf(res);
                    t1.setText(textview3);
                    min = false;
                }
                else if(mul == true){
                    val2 = Float.parseFloat(e1.getText().toString());
                    res = val1 * val2;
                    String textview3 = String.valueOf(res);
                    t1.setText(textview3);
                    mul = false;
                }
                else if(div == true){
                    val2 = Float.parseFloat(e1.getText().toString());
                    res = val1/val2;
                    String textview3 = String.valueOf(res);
                    t1.setText(textview3);
                    div = false;
                }
            }
        });
//        b15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(min == true){
//                    val2 = Float.parseFloat(e1.getText().toString());
//                    res = val1 - val2;
//                    String textview3 = String.valueOf(res);
//                    t1.setText(textview3);
//                    min = false;
//                }
//            }
//        });
//        b15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mul == true){
//                    val2 = Float.parseFloat(e1.getText().toString());
//                    res = val1 * val2;
//                    String textview3 = String.valueOf(res);
//                    t1.setText(textview3);
//                    mul = false;
//                }
//            }
//        });
//        b15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(div == true){
//                    val2 = Float.parseFloat(e1.getText().toString());
//                    res = val1/val2;
//                    String textview3 = String.valueOf(res);
//                    t1.setText(textview3);
//                    div = false;
//                }
//            }
//        });
    }
}