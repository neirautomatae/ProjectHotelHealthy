package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Podrak extends AppCompatActivity {

    private Button Backpod;
    private Button Backhmpod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podrak);

        Backpod = findViewById(R.id.btnbkpod);
        Backhmpod = findViewById(R.id.btnbkpodhm);

        Backpod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Backhmpod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkhmcvs1 = new Intent(Podrak.this , MainActivity.class);
                finish();
                startActivity(bkhmcvs1);
            }
        });

    }
}
