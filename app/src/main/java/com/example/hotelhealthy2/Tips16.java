package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips16 extends AppCompatActivity {

    private Button backtips16;
    private Button hometips16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips16);

        backtips16 = findViewById(R.id.btnbktips16);
        hometips16 = findViewById(R.id.btnhometips16);

        backtips16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips16 = new Intent(Tips16.this , MainActivity.class);
                finish();
                startActivity(hometips16);
            }
        });
    }
}
