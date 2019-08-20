package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips14 extends AppCompatActivity {

    private Button backtips14;
    private Button hometips14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips14);

        backtips14 = findViewById(R.id.btnbktips14);
        hometips14 = findViewById(R.id.btnhometips14);

        backtips14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips14 = new Intent(Tips14.this , MainActivity.class);
                finish();
                startActivity(hometips14);
            }
        });
    }
}
