package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thegrid extends AppCompatActivity {

    private Button backthe01;
    private Button bkhomethe01;
    private Button nextfdoren;
    private  Button nextfdblue;
    private  Button nextfdgreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thegrid);
        backthe01 = findViewById(R.id.btnbackthe);
        bkhomethe01 = findViewById(R.id.btnhomethe);
        nextfdoren = findViewById(R.id.btnfood2);
        nextfdblue = findViewById(R.id.btnfood3);
        nextfdgreen = findViewById(R.id.btnfood4);

        nextfdoren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextoren1 = new Intent(Thegrid.this , Food.class);
                finish();
                startActivity(nextoren1);
            }
        });

        nextfdblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextblue1 = new Intent(Thegrid.this , Food2.class);
                finish();
                startActivity(nextblue1);
            }
        });

        nextfdgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextgreen1 = new Intent(Thegrid.this , Food3.class);
                finish();
                startActivity(nextgreen1);
            }
        });

        backthe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bkhomethe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nexthomefod01 = new Intent(Thegrid.this , MainActivity.class);
                finish();
                startActivity(nexthomefod01);
            }
        });


    }
}
