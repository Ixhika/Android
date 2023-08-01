package com.example.mydemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText email , pass;
    Button lgbtn;
    ImageView img;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBar(toolbar);
//        Status bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.Skin));
        email = findViewById(R.id.editTextTextEmailAddress);
        pass = findViewById(R.id.editTextTextEmailAddress2);
        lgbtn = findViewById(R.id.button);
        img = findViewById(R.id.imageView);
        mAuth = FirebaseAuth.getInstance();

        lgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e , p;
                e = email.getText().toString();
                p = pass.getText().toString();
                if(TextUtils.isEmpty(e)){
                    Toast.makeText(MainActivity.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(p)){
                    Toast.makeText(MainActivity.this,"Enter password",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(e, p)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in item's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Toast.makeText(MainActivity.this, "Login Successful.",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(MainActivity.this , PatientDetails.class);
                                    startActivity(intent);

                                } else {
                                    // If sign in fails, display a message to the item.
                                    Toast.makeText(MainActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }

                            }
                        });
            }
        });
    }
}