package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calfemale extends AppCompatActivity {

    private Button clickcalmomannum1;
    private Button clickcalmomannum2;
    private Button clickcalmomannum3;
    private Button clickcalmomannum4;
    private Button clickcalmomannum5;
    private Button backmomancalhome;
    private EditText numbermoman1;
    private EditText numbermoman2;
    private EditText numbermoman3;
    private TextView ResultTextViewmoman;
    private int Nummoman1;
    private int Nummoman2;
    private int Nummoman3;
    private int resultmoman1;
    private int resultmoman2;
    private int resultmoman3;
    private int resultmoman4;
    private int resultmoman5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calfemale);
        clickcalmomannum1 =  findViewById(R.id.btnoneday2);
        clickcalmomannum2 =  findViewById(R.id.buttduy2);
        clickcalmomannum3 =  findViewById(R.id.butfday2);
        clickcalmomannum4 =  findViewById(R.id.buteday2);
        clickcalmomannum5 =  findViewById(R.id.butallday2);

        numbermoman1 =  findViewById(R.id.txtmonnan3);
        numbermoman2 =  findViewById(R.id.txtmonnan2);
        numbermoman3 =  findViewById(R.id.txtmonnan1);
        ResultTextViewmoman = findViewById(R.id.viewbmr2);
        backmomancalhome = findViewById(R.id.btnbackcal2);

        backmomancalhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calgohome = new Intent(Calfemale.this , MainActivity.class);
                finish();
                startActivity(calgohome);
            }
        });

        clickcalmomannum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Nummoman1  = Integer.parseInt(numbermoman1.getText().toString().trim());
                Nummoman2  = Integer.parseInt(numbermoman2.getText().toString().trim());
                Nummoman3  = Integer.parseInt(numbermoman3.getText().toString().trim());

                resultmoman1 = (int) (66+(13.7*Nummoman3+5*Nummoman2-6.8*Nummoman1)*1.2);

                ResultTextViewmoman.setText(resultmoman1+"");

            }
        });

        clickcalmomannum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Nummoman1  = Integer.parseInt(numbermoman1.getText().toString().trim());
                Nummoman2  = Integer.parseInt(numbermoman2.getText().toString().trim());
                Nummoman3  = Integer.parseInt(numbermoman3.getText().toString().trim());

                resultmoman2 = (int) (66+(13.7*Nummoman3+5*Nummoman2-6.8*Nummoman1)*1.375);

                ResultTextViewmoman.setText(resultmoman2+"");
            }
        });

        clickcalmomannum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Nummoman1  = Integer.parseInt(numbermoman1.getText().toString().trim());
                Nummoman2  = Integer.parseInt(numbermoman2.getText().toString().trim());
                Nummoman3  = Integer.parseInt(numbermoman3.getText().toString().trim());

                resultmoman3 = (int) (66+(13.7*Nummoman3+5*Nummoman2-6.8*Nummoman1)*1.55);

                ResultTextViewmoman.setText(resultmoman3+"");
            }
        });

        clickcalmomannum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Nummoman1  = Integer.parseInt(numbermoman1.getText().toString().trim());
                Nummoman2  = Integer.parseInt(numbermoman2.getText().toString().trim());
                Nummoman3  = Integer.parseInt(numbermoman3.getText().toString().trim());

                resultmoman4 = (int) (66+(13.7*Nummoman3+5*Nummoman2-6.8*Nummoman1)*1.725);

                ResultTextViewmoman.setText(resultmoman4+"");
            }
        });

        clickcalmomannum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Nummoman1  = Integer.parseInt(numbermoman1.getText().toString().trim());
                Nummoman2  = Integer.parseInt(numbermoman2.getText().toString().trim());
                Nummoman3  = Integer.parseInt(numbermoman3.getText().toString().trim());
                resultmoman5 = (int) (66+(13.7*Nummoman3+5*Nummoman2-6.8*Nummoman1)*1.9);
                ResultTextViewmoman.setText(resultmoman5+"");
            }
        });

    }



    public void clickbacknut2(View view) {
        finish();
    }

    public void clickboy2(View view) {

        Intent calboybk = new Intent(Calfemale.this , Cal.class);
        finish();
        startActivity(calboybk);

    }
}
