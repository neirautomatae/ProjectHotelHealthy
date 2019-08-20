package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips2 extends AppCompatActivity {

    private Button backtips2;
    private Button hometips2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips2);
        backtips2 = findViewById(R.id.btnbktips2);
        hometips2 = findViewById(R.id.btnhometips2);

        backtips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips2 = new Intent(Tips2.this , MainActivity.class);
                finish();
                startActivity(hometips2);
            }
        });
    }
}
