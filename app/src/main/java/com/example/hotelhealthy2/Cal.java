package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cal extends AppCompatActivity {

    private Button clickcalnum1;
    private Button clickcalnum2;
    private Button clickcalnum3;
    private Button clickcalnum4;
    private Button clickcalnum5;
    private Button backcalhome;
    private EditText number1;
    private EditText number2;
    private EditText number3;
    private TextView ResultTextView;
    private int Num1;
    private int Num2;
    private int Num3;
    private int result1;
    private int result2;
    private int result3;
    private int result4;
    private int result5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        clickcalnum1 =  findViewById(R.id.btnoneday);
        clickcalnum2 =  findViewById(R.id.buttduy);
        clickcalnum3 =  findViewById(R.id.butfday);
        clickcalnum4 =  findViewById(R.id.buteday);
        clickcalnum5 =  findViewById(R.id.butallday);

        number1 =  findViewById(R.id.txtbmr3);
        number2 =  findViewById(R.id.txtbmr2);
        number3 =  findViewById(R.id.txtbmr1);
        ResultTextView = findViewById(R.id.viewbmr);
        backcalhome = findViewById(R.id.btnbackcal1);

        backcalhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calgohome = new Intent(Cal.this , MainActivity.class);
                finish();
                startActivity(calgohome);
            }
        });

        clickcalnum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Num1  = Integer.parseInt(number1.getText().toString().trim());
                Num2  = Integer.parseInt(number2.getText().toString().trim());
                Num3  = Integer.parseInt(number3.getText().toString().trim());

                result1 = (int) (66+(13.7*Num3+5*Num2-6.8*Num1)*1.2);

                ResultTextView.setText(result1+"");
            }
        });

        clickcalnum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Num1  = Integer.parseInt(number1.getText().toString().trim());
                Num2  = Integer.parseInt(number2.getText().toString().trim());
                Num3  = Integer.parseInt(number3.getText().toString().trim());
                result2 = (int) (66+(13.7*Num3+5*Num2-6.8*Num1)*1.375);
                ResultTextView.setText(result2+"");
            }
        });

        clickcalnum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Num1  = Integer.parseInt(number1.getText().toString().trim());
                Num2  = Integer.parseInt(number2.getText().toString().trim());
                Num3  = Integer.parseInt(number3.getText().toString().trim());
                result3 = (int) (66+(13.7*Num3+5*Num2-6.8*Num1)*1.55);
                ResultTextView.setText(result3+"");
            }
        });

        clickcalnum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Num1  = Integer.parseInt(number1.getText().toString().trim());
                Num2  = Integer.parseInt(number2.getText().toString().trim());
                Num3  = Integer.parseInt(number3.getText().toString().trim());
                result4 = (int) (66+(13.7*Num3+5*Num2-6.8*Num1)*1.725);
                ResultTextView.setText(result4+"");
            }
        });

        clickcalnum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Num1  = Integer.parseInt(number1.getText().toString().trim());
                Num2  = Integer.parseInt(number2.getText().toString().trim());
                Num3  = Integer.parseInt(number3.getText().toString().trim());
                result5 = (int) (66+(13.7*Num3+5*Num2-6.8*Num1)*1.9);
                ResultTextView.setText(result5+"");
            }
        });

    }



    public void clickbacknut(View view) {
        finish();
    }



    public void clickfemale(View view) {
        Intent femal = new Intent(Cal.this ,Calfemale.class);
        finish();
        startActivity(femal);

    }

}
