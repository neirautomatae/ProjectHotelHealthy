package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips17 extends AppCompatActivity {

    private Button backtips17;
    private Button hometips17;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips17);

        backtips17 = findViewById(R.id.btnbktips17);
        hometips17 = findViewById(R.id.btnhometips17);

        backtips17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips17 = new Intent(Tips17.this , MainActivity.class);
                finish();
                startActivity(hometips17);
            }
        });
    }
}
