package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips5 extends AppCompatActivity {

    private Button backtips5;
    private Button hometips5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips5);
        backtips5 = findViewById(R.id.btnbktips5);
        hometips5 = findViewById(R.id.btnhometips5);

        backtips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips5 = new Intent(Tips5.this , MainActivity.class);
                finish();
                startActivity(hometips5);
            }
        });
    }
}
