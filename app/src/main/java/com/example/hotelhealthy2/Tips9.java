package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips9 extends AppCompatActivity {

    private Button backtips9;
    private Button hometips9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips9);
        backtips9 = findViewById(R.id.btnbktips9);
        hometips9 = findViewById(R.id.btnhometips9);

        backtips9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips9 = new Intent(Tips9.this , MainActivity.class);
                finish();
                startActivity(hometips9);
            }
        });
    }
}
