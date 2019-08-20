package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Disease extends AppCompatActivity {
    private Button backmenuho;
    private Button backhel;
    private Button nextcv;
    private Button nextpod;
    private Button nextpaj;
    private Button nextpill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        backmenuho = findViewById(R.id.btndis);
        backhel = findViewById(R.id.btnbackhel);
        nextcv = findViewById(R.id.btncvs);
        nextpod = findViewById(R.id.btnpod);
        nextpaj = findViewById(R.id.btnsuk);
        nextpill = findViewById(R.id.btnpill);



        backmenuho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        backhel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hel = new Intent(Disease.this ,MainActivity.class);
                finish();
                startActivity(hel);

            }
        });

        nextcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cv1 = new Intent(Disease.this ,Cvs.class);
                startActivity(cv1);

            }
        });

        nextpod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent po1 = new Intent(Disease.this ,Podrak.class);
                startActivity(po1);

            }
        });

        nextpaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paw = new Intent(Disease.this ,Pajpud.class);
                startActivity(paw);

            }
        });


        nextpill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pil1 = new Intent(Disease.this ,Pillow.class);
                startActivity(pil1);

            }
        });


    }
}
