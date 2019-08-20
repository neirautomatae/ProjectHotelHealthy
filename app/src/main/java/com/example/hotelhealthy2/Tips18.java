package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips18 extends AppCompatActivity {

    private Button backtips18;
    private Button hometips18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips18);

        backtips18 = findViewById(R.id.btnbktips18);
        hometips18 = findViewById(R.id.btnhometips18);

        backtips18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips18 = new Intent(Tips18.this , MainActivity.class);
                finish();
                startActivity(hometips18);
            }
        });
    }
}
