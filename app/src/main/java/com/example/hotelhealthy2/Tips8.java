package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips8 extends AppCompatActivity {

    private Button backtips8;
    private Button hometips8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips8);
        backtips8 = findViewById(R.id.btnbktips8);
        hometips8 = findViewById(R.id.btnhometips8);

        backtips8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips8 = new Intent(Tips8.this , MainActivity.class);
                finish();
                startActivity(hometips8);
            }
        });
    }
}
