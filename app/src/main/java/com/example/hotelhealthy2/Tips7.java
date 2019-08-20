package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips7 extends AppCompatActivity {

    private Button backtips7;
    private Button hometips7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips7);
        backtips7 = findViewById(R.id.btnbktips7);
        hometips7 = findViewById(R.id.btnhometips7);

        backtips7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips6 = new Intent(Tips7.this , MainActivity.class);
                finish();
                startActivity(hometips6);
            }
        });
    }
}

