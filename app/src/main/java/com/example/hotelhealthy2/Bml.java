package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bml extends AppCompatActivity {

    private Button btnbackhe;

    private TextView ResultTextViewbmi;
    private EditText numberbmi1;
    private EditText numberbmi2;
    private double Numbmi1, Numbmi2;
    private android.widget.Button Resultbmi;
    private  double x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bml);
        numberbmi1 = findViewById(R.id.txtbmi1);
        numberbmi2 = findViewById(R.id.txtbmi2);
        ResultTextViewbmi =  findViewById(R.id.viewresultbmi);
        btnbackhe = findViewById(R.id.btnbackhe);
        Resultbmi = findViewById(R.id.btnresultbmi);


        btnbackhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mneb1 = new Intent(Bml.this, MainActivity.class);
                finish();
                startActivity(mneb1);
            }
        });

        Resultbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Numbmi1 = Integer.parseInt(numberbmi1.getText().toString().trim());
                Numbmi2 = Integer.parseInt(numberbmi2.getText().toString().trim());
                x = 100 ;
                double result = Numbmi2 / (Numbmi1 *2.0/x );
                ResultTextViewbmi.setText(String.valueOf(result));

            }
        });
    }

    public void clickbackbmi(View view) {
        finish();
    }
}