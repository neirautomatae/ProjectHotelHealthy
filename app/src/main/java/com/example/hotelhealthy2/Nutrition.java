package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nutrition extends AppCompatActivity {

    private Button nextcal;
    private Button nextgrid;
    private Button nextback1;
    private Button nextbmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
        nextcal = findViewById(R.id.btnbmr);
        nextgrid = findViewById(R.id.btngrid);
        nextback1 = findViewById(R.id.btnbackmain);
        nextbmi = findViewById(R.id.btnbmi) ;

        nextcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gocal = new Intent(Nutrition.this , Cal.class);
                startActivity(gocal);
            }
        });

        nextgrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextgrid1 = new Intent(Nutrition.this , Thegrid.class);
                startActivity(nextgrid1);
            }
        });


        nextback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        nextbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gobmi = new Intent(Nutrition.this , Bml.class);
                startActivity(gobmi);
            }
        });
    }

    public void clickback(View view) {
        finish();
    }

}
