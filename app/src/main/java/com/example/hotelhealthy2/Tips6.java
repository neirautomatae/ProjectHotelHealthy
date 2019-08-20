package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips6 extends AppCompatActivity {

    private Button backtips6;
    private Button hometips6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips6);
        backtips6 = findViewById(R.id.btnbktips6);
        hometips6 = findViewById(R.id.btnhometips6);

        backtips6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips6 = new Intent(Tips6.this , MainActivity.class);
                finish();
                startActivity(hometips6);
            }
        });
    }
}
