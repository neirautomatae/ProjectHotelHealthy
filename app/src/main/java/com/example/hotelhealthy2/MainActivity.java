package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_filpper;
    private Button nextnutrition;
    private Button nexthealth;
    private Button nextwork;
    private Button nexttips ;
    private Button nexttele;
    private Button nextapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v_filpper = findViewById(R.id.v_flipper);

        nextnutrition = findViewById(R.id.btnNutrition);
        nexthealth = findViewById(R.id.btnHealth);
        nextwork = findViewById(R.id.btnWork);
        nexttips = findViewById(R.id.btnTips);
        nexttele = findViewById(R.id.btnTele);
        nextapp = findViewById(R.id.btnApp1);

        int images[] = {R.drawable.bghome1, R.drawable.bghome2,R.drawable.bghome3,R.drawable.bghome4};

        // for loop
        /*for (int i = 0; i < images.length; i++){
             flipperImages(images[i]);
        }*/
        //but I prefer foreach

        for (int image : images){
            flipperImages(image);
        }

        nextnutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(MainActivity.this , Nutrition.class);
                startActivity(n);
            }
        });

        nexthealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(MainActivity.this, Health.class);
                startActivity(h);
            }
        });

        nextwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(MainActivity.this , Work.class);
                startActivity(w);

            }
        });

        nexttips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(MainActivity.this , Tips.class);
                startActivity(t);
            }
        });

        nexttele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tl = new Intent(MainActivity.this , TelePhone.class);
                startActivity(tl);
            }
        });

        nextapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ap = new Intent(MainActivity.this , Aboutapp.class);
                startActivity(ap);
            }
        });
    }
    public void  flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_filpper.addView(imageView);
        v_filpper.setFlipInterval(4000); //8 sec
        v_filpper.setAutoStart(true);

        //animation
        v_filpper.setInAnimation(this,android.R.anim.slide_in_left);
        v_filpper.setOutAnimation(this,android.R.anim.slide_out_right);
    }


}
