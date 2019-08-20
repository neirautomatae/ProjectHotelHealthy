package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pajpud extends AppCompatActivity {

    private Button Backpaj;
    private Button Backhmpaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajpud);

        Backpaj = findViewById(R.id.btnbkpaj);
        Backhmpaj = findViewById(R.id.btnbkpajhm);

        Backpaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Backhmpaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkhmcvs1 = new Intent(Pajpud.this , MainActivity.class);
                finish();
                startActivity(bkhmcvs1);
            }
        });

    }
}
