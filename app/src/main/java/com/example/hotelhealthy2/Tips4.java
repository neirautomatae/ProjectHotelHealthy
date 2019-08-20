package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips4 extends AppCompatActivity {
    private Button backtips4;
    private Button hometips4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips4);
        backtips4 = findViewById(R.id.btnbktips4);
        hometips4 = findViewById(R.id.btnhometips4);

        backtips4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips4 = new Intent(Tips4.this , MainActivity.class);
                finish();
                startActivity(hometips4);
            }
        });
    }
}
