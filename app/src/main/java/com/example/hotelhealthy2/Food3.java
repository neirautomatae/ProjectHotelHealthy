package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food3 extends AppCompatActivity {

    private Button backgreen001;
    private Button bkgreenthe001;
    private Button greennextred0;
    private  Button greennextoren0;
    private  Button greennextblue0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);

        backgreen001 = findViewById(R.id.btnbkgreen);
        bkgreenthe001 = findViewById(R.id.btngreenhome);
        greennextred0 = findViewById(R.id.btngnred);
        greennextoren0 = findViewById(R.id.btngnoren);
        greennextblue0 = findViewById(R.id.btngnblue);

        greennextred0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backgreen1 = new Intent(Food3.this , Thegrid.class);
                finish();
                startActivity(backgreen1);
            }
        });

        greennextoren0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkgreen001 = new Intent(Food3.this , Food.class);
                finish();
                startActivity(bkgreen001);
            }
        });

        greennextblue0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent greennextbl = new Intent(Food3.this , Food2.class);
                finish();
                startActivity(greennextbl);
            }
        });

        backgreen001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bkgreenthe001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkgreen04 = new Intent(Food3.this , MainActivity.class);
                finish();
                startActivity(bkgreen04);
            }
        });


    }
}
