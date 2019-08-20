package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips1 extends AppCompatActivity {

    private Button backtips1;
    private Button hometips1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips1);
        backtips1 = findViewById(R.id.btnbktips1);
        hometips1 = findViewById(R.id.btnhometips1);

        backtips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips1 = new Intent(Tips1.this , MainActivity.class);
                finish();
                startActivity(hometips1);
            }
        });
    }
}
