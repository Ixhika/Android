package com.example.fabapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton add , translate , scale, blink , rotate;
    ImageView img;
    boolean addclick = true;
    Animation animTranslate , animRotate , animScale , animBlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.floatingActionButton);
        translate = findViewById(R.id.floatingActionButton4);
        scale = findViewById(R.id.floatingActionButton6);
        blink = findViewById(R.id.floatingActionButton7);
        rotate = findViewById(R.id.floatingActionButton5);
        img = findViewById(R.id.imageView);

        animTranslate = AnimationUtils.loadAnimation(this,R.anim.translate);
        animRotate = AnimationUtils.loadAnimation(this , R.anim.rotate);
        animScale = AnimationUtils.loadAnimation(this,R.anim.scale);
        animBlink = AnimationUtils.loadAnimation(this,R.anim.set);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addclick){
                    translate.show();
                    scale.show();
                    blink.show();
                    rotate.show();
                    addclick = false;
                }else{
                    translate.hide();
                    scale.hide();
                    blink.hide();
                    rotate.hide();
                    addclick = true;
                }
            }
        });
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(animTranslate);
            }
        });
        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(animScale);
            }
        });
    rotate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            img.startAnimation(animRotate);
        }
    });
    blink.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            img.startAnimation(animBlink);
        }
    });
    }
}