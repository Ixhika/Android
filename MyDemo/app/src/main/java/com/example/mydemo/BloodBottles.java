package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class BloodBottles extends AppCompatActivity {
    ArrayList<Value> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_bottles);

        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.Skin));
//        arrayList = new ArrayList<>();
        arrayList = (ArrayList<Value>) getIntent().getSerializableExtra("arrli");

        for(int i = 0;i<arrayList.size();i++){
            Value ob = arrayList.get(i);
            String type = ob.getType();
            int count = ob.getCount();
            addBottleCard(type, count);
        }
    }

    public void addBottleCard(String type, int count){
        LinearLayout linearLayout = findViewById(R.id.container);
        View view = getLayoutInflater().inflate(R.layout.custom_view,null);
        TextView textView1 = view.findViewById(R.id.type);
        TextView textView2 = view.findViewById(R.id.count);
        textView1.setText(type);
        textView2.setText(String.valueOf(count));
        linearLayout.addView(view);
    }
}