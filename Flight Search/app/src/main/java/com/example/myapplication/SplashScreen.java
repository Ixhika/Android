package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    LottieAnimationView l1 , l2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.blue));

        l1 = findViewById(R.id.lottie);
        l2 = findViewById(R.id.lottie2);

        l1.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
        l2.animate().translationX(2000).setDuration(2000).setStartDelay(2900);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
            }
        },3000);

    }
}