package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton search , contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.DarkBlue));

        search = findViewById(R.id.imageButton1);
        contact = findViewById(R.id.imageButton2);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.spicejet, "Holiday Bookings", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.indigo, "Weekend Night outs" , ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.offerflight, "Be first to grab the offer" , ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Contact.class);
                startActivity(intent);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SearchFlights.class);
                startActivity(intent);
            }
        });


    }
}