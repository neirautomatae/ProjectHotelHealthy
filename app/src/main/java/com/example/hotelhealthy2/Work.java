package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Work extends AppCompatActivity {

    private Button nextSafety,nextmaid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        nextSafety = findViewById(R.id.btnSafety);
        nextmaid= findViewById(R.id.btnmaid);

        nextSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSafety = new Intent(Work.this ,Safety.class);
                startActivity(btnSafety);

            }
        });

        nextmaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSafety = new Intent(Work.this ,Mind.class);
                startActivity(btnSafety);

            }
        });
    }

    public void Clickback(View view) {
        finish();
    }
}
