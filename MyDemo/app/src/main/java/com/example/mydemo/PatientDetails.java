package com.example.mydemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class PatientDetails extends AppCompatActivity {
    EditText pname , pphone , page;
    Spinner sp1 , sp2;
    EditText blevel;
    Button next;
    DatabaseReference fireBase;
    ArrayList<Value> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.Skin));

        fireBase = FirebaseDatabase.getInstance().getReference("BBType");
        arrayList = new ArrayList<>();

        pname = findViewById(R.id.editTextNumber);
        pphone = findViewById(R.id.editTextPhone);
        page = findViewById(R.id.editTextNumber2);
        sp1 = findViewById(R.id.spinner);
        sp2 = findViewById(R.id.spinner2);
        blevel = findViewById(R.id.editTextNumber3);
        next = findViewById(R.id.button2);

        fetch();

        String[] G = {"Male" , "Female"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,G);
        sp1.setAdapter(ad);


        String[] BloodType = {"A+" , "B+" , "AB+" , "O" , "A-" , "B-" , "AB-"};
        ArrayAdapter add = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,BloodType);
        sp2.setAdapter(add);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientDetails.this, BloodBottles.class);
                intent.putExtra("arrli", arrayList);
                startActivity(intent);
            }
        });
    }

    public void fetch(){
        fireBase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                arrayList.clear();
                for(DataSnapshot data:snapshot.getChildren()){
                    System.out.println("ArrayList Size -->"+arrayList.size());
                    Value ob = data.getValue(Value.class);
                    arrayList.add(ob);
                }

                System.out.println(arrayList.size());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}