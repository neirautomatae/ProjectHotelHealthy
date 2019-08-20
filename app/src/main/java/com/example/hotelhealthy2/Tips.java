package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips extends AppCompatActivity {

    private Button graphic1;
    private Button graphic2;
    private Button graphic3;
    private Button graphic4;
    private Button graphic5;
    private Button graphic6;
    private Button graphic7;
    private Button graphic8;
    private Button graphic9;
    private Button graphic10;
    private Button graphic11;
    private Button graphic12;
    private Button graphic13;
    private Button graphic14;
    private Button graphic15;
    private Button graphic16;
    private Button graphic17;
    private Button graphic18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        graphic1 = findViewById(R.id.tips1);
        graphic2 = findViewById(R.id.tips2);
        graphic3 = findViewById(R.id.tips3);
        graphic4 = findViewById(R.id.tips4);
        graphic5 = findViewById(R.id.tips5);
        graphic6 = findViewById(R.id.tips6);
        graphic7 = findViewById(R.id.tips7);
        graphic8 = findViewById(R.id.tips8);
        graphic9 = findViewById(R.id.tips9);
        graphic10 = findViewById(R.id.tips10);
        graphic11 = findViewById(R.id.tips11);
        graphic12 = findViewById(R.id.tips12);
        graphic13 = findViewById(R.id.tips13);
        graphic14 = findViewById(R.id.tips14);
        graphic15 = findViewById(R.id.tips15);
        graphic16 = findViewById(R.id.btntips16);
        graphic17 = findViewById(R.id.btntips17);
        graphic18 = findViewById(R.id.btntips18);



        graphic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic1 = new Intent(Tips.this , Tips1.class);
                startActivity(nextghic1);
            }
        });

        graphic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic2 = new Intent(Tips.this , Tips2.class);
                startActivity(nextghic2);
            }
        });

        graphic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic3 = new Intent(Tips.this , Tips3.class);
                startActivity(nextghic3);
            }
        });

        graphic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic4 = new Intent(Tips.this , Tips4.class);
                startActivity(nextghic4);
            }
        });

        graphic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic5 = new Intent(Tips.this , Tips5.class);
                startActivity(nextghic5);
            }
        });

        graphic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic6 = new Intent(Tips.this , Tips6.class);
                startActivity(nextghic6);
            }
        });

        graphic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic7 = new Intent(Tips.this , Tips7.class);
                startActivity(nextghic7);
            }
        });

        graphic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic8 = new Intent(Tips.this , Tips8.class);
                startActivity(nextghic8);
            }
        });

        graphic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic9 = new Intent(Tips.this , Tips9.class);
                startActivity(nextghic9);
            }
        });

        graphic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic10 = new Intent(Tips.this , Tips10.class);
                startActivity(graphic10);
            }
        });

        graphic11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic11 = new Intent(Tips.this , Tips11.class);
                startActivity(nextghic11);
            }
        });

        graphic12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic12 = new Intent(Tips.this , Tips12.class);
                startActivity(nextghic12);
            }
        });

        graphic13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic13 = new Intent(Tips.this , Tips13.class);
                startActivity(nextghic13);
            }
        });

        graphic14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic14 = new Intent(Tips.this , Tips14.class);
                startActivity(nextghic14);
            }
        });

        graphic15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic15 = new Intent(Tips.this , Tips15.class);
                startActivity(nextghic15);
            }
        });

        graphic16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic16 = new Intent(Tips.this , Tips16.class);
                startActivity(nextghic16);

            }
        });

        graphic17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic17 = new Intent(Tips.this , Tips17.class);
                startActivity(nextghic17);

            }
        });

        graphic18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextghic18 = new Intent(Tips.this , Tips18.class);
                startActivity(nextghic18);

            }
        });

    }



    public void clickbackh(View view) {

        finish();

    }
}
