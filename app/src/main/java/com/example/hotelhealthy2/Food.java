package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food extends AppCompatActivity {

    private Button backoren01;
    private Button bkorenthe01;
    private Button nextred;
    private  Button nextblue;
    private  Button nextgreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        backoren01 = findViewById(R.id.btnbkfod);
        bkorenthe01 = findViewById(R.id.btnhomefod);
        nextred = findViewById(R.id.btnfdred);
        nextblue = findViewById(R.id.btnfdblue);
        nextgreen = findViewById(R.id.btnfdgreen3);

        nextred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orennextred1 = new Intent(Food.this , Thegrid.class);
                finish();
                startActivity(orennextred1);
            }
        });

        nextblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orennextblue1 = new Intent(Food.this , Food2.class);
                finish();
                startActivity(orennextblue1);
            }
        });

        nextgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orennextgreen1 = new Intent(Food.this , Food3.class);
                finish();
                startActivity(orennextgreen1);
            }
        });

        backoren01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bkorenthe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nexthomefod01 = new Intent(Food.this , MainActivity.class);
                finish();
                startActivity(nexthomefod01);
            }
        });


    }
}
