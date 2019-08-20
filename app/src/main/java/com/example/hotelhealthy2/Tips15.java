package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips15 extends AppCompatActivity {

    private Button backtips15;
    private Button hometips15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips15);

        backtips15 = findViewById(R.id.btnbktips15);
        hometips15 = findViewById(R.id.btnhometips15);

        backtips15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips15 = new Intent(Tips15.this , MainActivity.class);
                finish();
                startActivity(hometips15);
            }
        });
    }
}
