package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips13 extends AppCompatActivity {

    private Button backtips13;
    private Button hometips13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips13);

        backtips13 = findViewById(R.id.btnbktips13);
        hometips13 = findViewById(R.id.btnhometips13);

        backtips13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        hometips13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips13 = new Intent(Tips13.this , MainActivity.class);
                finish();
                startActivity(hometips13);
            }
        });
    }
}
