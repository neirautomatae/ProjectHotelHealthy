package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelePhone extends AppCompatActivity {

    private Button nexttele1;
    private Button nexttele2;
    private Button nexttele3;
    private Button nexthometel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele_phone);
        nexthometel = findViewById(R.id.btnhometel);
        nexttele1 = findViewById(R.id.telephone1);
        nexttele2 = findViewById(R.id.telephone2);
        nexttele3 = findViewById(R.id.telephone3);

        nexthometel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        nexttele1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextphone1 = new Intent(TelePhone.this , Numbertele1.class);
                startActivity(nextphone1);
            }
        });

        nexttele2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextphone2 = new Intent(TelePhone.this , Numbertele2.class);
                startActivity(nextphone2);
            }
        });

        nexttele3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextphone3 = new Intent(TelePhone.this , Numbertele3.class);
                startActivity(nextphone3);
            }
        });
    }
}
