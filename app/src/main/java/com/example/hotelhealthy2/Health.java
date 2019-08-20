package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Health extends AppCompatActivity {

    private Button nextexe;
    private Button nextdis;
    private Button backheal1;
    private Button backhealhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        nextexe = findViewById(R.id.btnex);
        nextdis = findViewById(R.id.btndisea);
        backheal1 = findViewById(R.id.btnbackheal);
        backhealhome = findViewById(R.id.btnbackhealhome);


        nextexe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nex = new Intent(Health.this ,Exercise.class);
                startActivity(nex);
            }
        });

        nextdis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exe = new Intent(Health.this ,Disease.class);
                startActivity(exe);
            }
        });

        backheal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        backhealhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}

