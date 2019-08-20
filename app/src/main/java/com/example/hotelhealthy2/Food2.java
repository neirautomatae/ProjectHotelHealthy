package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food2 extends AppCompatActivity {

    private Button backblue001;
    private Button bkbluethe001;
    private Button bluenextred0;
    private  Button bluenextoren0;
    private  Button bluenextgreen0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);
        backblue001 = findViewById(R.id.btnbackblue);
        bkbluethe001 = findViewById(R.id.btnhomeblue);
        bluenextred0 = findViewById(R.id.btnblred);
        bluenextoren0 = findViewById(R.id.btnbloren);
        bluenextgreen0 = findViewById(R.id.btnblgreen3);

        bluenextred0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bluenextred1 = new Intent(Food2.this , Thegrid.class);
                finish();
                startActivity(bluenextred1);
            }
        });

        bluenextoren0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bluenextoren = new Intent(Food2.this , Food.class);
                finish();
                startActivity(bluenextoren);
            }
        });

        bluenextgreen0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bluenextgreen = new Intent(Food2.this , Food3.class);
                finish();
                startActivity(bluenextgreen);
            }
        });

        backblue001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bkbluethe001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkbluethe = new Intent(Food2.this , MainActivity.class);
                finish();
                startActivity(bkbluethe);
            }
        });


    }
}
