package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips3 extends AppCompatActivity {

    private Button backtips3;
    private Button hometips3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips3);
        backtips3 = findViewById(R.id.btnbktips3);
        hometips3 = findViewById(R.id.btnhometips3);

        backtips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips3 = new Intent(Tips3.this , MainActivity.class);
                finish();
                startActivity(hometips3);
            }
        });
    }
}
