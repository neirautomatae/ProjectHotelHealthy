package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Safety extends AppCompatActivity {

    private Button backbkwork;
    private Button backSafety ;
    private Button ybclib1;
    private Button ybclib2;
    private Button ybclib3;
    private Button ybclib4;
    private Button ybclib5;
    private Button ybclib6;
    private Button ybclib7;
    private Button ybclib8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety);
        backSafety = findViewById(R.id.btnbacksafety);
        ybclib1 = findViewById(R.id.cilb1);
        ybclib2 = findViewById(R.id.cilb2);
        ybclib3 = findViewById(R.id.cilb3);
        ybclib4 = findViewById(R.id.cilb4);
        ybclib5 = findViewById(R.id.cilb5);
        ybclib6 = findViewById(R.id.cilb6);
        ybclib7 = findViewById(R.id.clib7);
        ybclib8 = findViewById(R.id.clib8);
        backbkwork = findViewById(R.id.btnbkeg1);

        backbkwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ybclib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube1 = new Intent(Intent.ACTION_VIEW);
                youtube1.setData(Uri.parse("https://www.youtube.com/watch?v=Za7cpj0RLJE"));
                startActivity(youtube1);
            }
        });

        ybclib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube2 = new Intent(Intent.ACTION_VIEW);
                youtube2.setData(Uri.parse("https://www.youtube.com/watch?v=cTmDcd5jOTE&t=9s"));
                startActivity(youtube2);
            }
        });

        ybclib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube3 = new Intent(Intent.ACTION_VIEW);
                youtube3.setData(Uri.parse("https://www.youtube.com/watch?v=iHkYF0sa-bw"));
                startActivity(youtube3);
            }
        });

        ybclib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube4 = new Intent(Intent.ACTION_VIEW);
                youtube4.setData(Uri.parse("https://www.youtube.com/watch?v=-6hqR8jhvBM&t=28s"));
                startActivity(youtube4);
            }
        });

        ybclib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube5 = new Intent(Intent.ACTION_VIEW);
                youtube5.setData(Uri.parse("https://www.youtube.com/watch?v=aALu1-ggzX8&t=100s"));
                startActivity(youtube5);
            }
        });

        ybclib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube6 = new Intent(Intent.ACTION_VIEW);
                youtube6.setData(Uri.parse("https://www.youtube.com/watch?v=rvoeExDfQIc&t=20s"));
                startActivity(youtube6);
            }
        });

        ybclib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube7 = new Intent(Intent.ACTION_VIEW);
                youtube7.setData(Uri.parse("https://www.youtube.com/watch?v=RaWglZbPMzg"));
                startActivity(youtube7);
            }
        });

        ybclib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube8 = new Intent(Intent.ACTION_VIEW);
                youtube8.setData(Uri.parse("https://www.youtube.com/watch?v=tyn7cCaeTcQ"));
                startActivity(youtube8);
            }
        });



        backSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backsafehm1 = new Intent(Safety.this , MainActivity.class);
                finish();
            startActivity(backsafehm1);
            }
        });

    }
}
