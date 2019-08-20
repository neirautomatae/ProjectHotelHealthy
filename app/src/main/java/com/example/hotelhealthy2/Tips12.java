package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips12 extends AppCompatActivity {

    private Button backtips12;
    private Button hometips12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips12);
        backtips12 = findViewById(R.id.btnbktips12);
        hometips12 = findViewById(R.id.btnhometips12);

        backtips12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips12 = new Intent(Tips12.this , MainActivity.class);
                finish();
                startActivity(hometips12);
            }
        });
    }
}
