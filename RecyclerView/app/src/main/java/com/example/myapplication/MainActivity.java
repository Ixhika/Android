package com.example.myapplication;

import androidx.activity.contextaware.ContextAware;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact_model> arr = new ArrayList<>();
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));

        arr.add(new Contact_model(R.drawable.person_1,"Ishi" , "8790100365"));
        arr.add(new Contact_model(R.drawable.person_2,"Vru" , "8789700102"));
        arr.add(new Contact_model(R.drawable.person_3,"Vani" , "87100365"));
        arr.add(new Contact_model(R.drawable.person_4,"Subhu" , "9473344315"));
        arr.add(new Contact_model(R.drawable.person_5,"Rinku" , "973001233"));
        arr.add(new Contact_model(R.drawable.person_6,"Nayan" , "9762313234"));
        arr.add(new Contact_model(R.drawable.person_7,"Aryan" , "54368979563"));
        arr.add(new Contact_model(R.drawable.person_8,"Anup" , "24687662356"));
        arr.add(new Contact_model(R.drawable.person_9,"Krishi" , "56875331130"));
        arr.add(new Contact_model(R.drawable.person_10,"Evan" , "1595389790"));
        arr.add(new Contact_model(R.drawable.person_11,"Aashi" , "158239773349"));
        arr.add(new Contact_model(R.drawable.person_12,"Anisha" , "16699330311"));
        arr.add(new Contact_model(R.drawable.person_13,"Ashmit" , "9003879300"));
        arr.add(new Contact_model(R.drawable.person_14,"Veer" , "9712550036"));


        RecyclerContactAdpater adpater = new RecyclerContactAdpater(this,arr);
        rv.setAdapter(adpater);



    }
}