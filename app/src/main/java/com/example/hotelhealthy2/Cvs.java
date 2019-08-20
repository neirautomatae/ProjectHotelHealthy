package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cvs extends AppCompatActivity {

    private Button Backcvs;
    private Button Backhmcvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvs);

        Backcvs = findViewById(R.id.btnbkcvs);
        Backhmcvs = findViewById(R.id.btnbkcvshm);

        Backcvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Backhmcvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkhmcvs1 = new Intent(Cvs.this , MainActivity.class);
                finish();
                startActivity(bkhmcvs1);
            }
        });

    }
}
