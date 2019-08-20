package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips10 extends AppCompatActivity {

    private Button backtips10;
    private Button hometips10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips10);
        backtips10 = findViewById(R.id.btnbktips10);
        hometips10 = findViewById(R.id.btnhometips10);

        backtips10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips10 = new Intent(Tips10.this , MainActivity.class);
                finish();
                startActivity(hometips10);
            }
        });
    }
}
