package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gay extends AppCompatActivity {

    private Button bkgaymind;
    private Button bkgayhmmd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gay);

        bkgaymind = findViewById(R.id.btnbkgay1);
        bkgayhmmd = findViewById(R.id.btnbkgayhm1);

        bkgaymind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bkgayhmmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkgay01 = new Intent(Gay.this , MainActivity.class);
                finish();
                startActivity(bkgay01);
            }
        });

    }

    public void clickoff(View view) {

        Intent weboff = new Intent(Intent.ACTION_VIEW);
        weboff.setData(Uri.parse("https://www.youtube.com/watch?v=GdGhD-oBFIY"));
        startActivity(weboff);
    }

    public void clickpary(View view) {

        Intent webpaty = new Intent(Intent.ACTION_VIEW);
        webpaty.setData(Uri.parse("https://www.youtube.com/watch?v=CcIKnEBD1hA&t=272s"));
        startActivity(webpaty);
    }
}
