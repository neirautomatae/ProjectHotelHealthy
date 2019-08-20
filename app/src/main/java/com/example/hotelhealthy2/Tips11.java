package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips11 extends AppCompatActivity {

    private Button backtips11;
    private Button hometips11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips11);

        backtips11 = findViewById(R.id.btnbktips11);
        hometips11 = findViewById(R.id.btnhometips11);

        backtips11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips11 = new Intent(Tips11.this , MainActivity.class);
                finish();
                startActivity(hometips11);
            }
        });
    }
}
