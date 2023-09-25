package com.example.login;

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

import com.example.login.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AdminLogin extends AppCompatActivity {
    EditText aname , apassword;
    Button lgin , sign;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green3));

        aname = findViewById(R.id.email);
        apassword = findViewById(R.id.password);
        lgin = findViewById(R.id.button2);
        mAuth = FirebaseAuth.getInstance();


        lgin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e , p;
                e = aname.getText().toString();
                p = apassword.getText().toString();
                if(TextUtils.isEmpty(e)){
                    Toast.makeText(AdminLogin.this,"Enter email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(p)){
                    Toast.makeText(AdminLogin.this,"Enter password",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(e, p)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in item's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Toast.makeText(AdminLogin.this, "Login Successful.",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(AdminLogin.this , MainActivity2.class);
                                    startActivity(intent);

                                } else {
                                    // If sign in fails, display a message to the item.
                                    Toast.makeText(AdminLogin.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }

                            }
                        });
            }
        });

    }
}