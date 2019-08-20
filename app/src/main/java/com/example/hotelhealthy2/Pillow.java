package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pillow extends AppCompatActivity {

    private Button Backpill;
    private Button Backhmpill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pillow);

        Backpill = findViewById(R.id.btnbkpill);
        Backhmpill = findViewById(R.id.btnbkpillhm);

        Backpill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Backhmpill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkhmcvs1 = new Intent(Pillow.this , MainActivity.class);
                finish();
                startActivity(bkhmcvs1);
            }
        });

    }
}
