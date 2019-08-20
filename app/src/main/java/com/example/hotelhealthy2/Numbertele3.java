package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Numbertele3 extends AppCompatActivity {

    private Button backmutele3;
    private Button backhometele3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbertele3);
        backmutele3 = findViewById(R.id.btnbacktele3);
        backhometele3 = findViewById(R.id.btnhometele3);

        backmutele3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbertele3.this.finish();
            }
        });

        backhometele3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backhometele2 = new Intent(Numbertele3.this , MainActivity.class);
                finish();
                startActivity(backhometele2);
            }
        });


    }

    public void clickMobile01(View view) {
        Intent mobile1Intent01 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent01.setData(Uri.parse("tel:191"));
        startActivity(mobile1Intent01);
    }

    public void clickMobile02(View view) {
        Intent mobile1Intent02 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent02.setData(Uri.parse("tel:199"));
        startActivity(mobile1Intent02);
    }

    public void clickMobile03(View view) {
        Intent mobile1Intent03 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent03.setData(Uri.parse("tel:1155"));
        startActivity(mobile1Intent03);
    }

    public void clickMobile04(View view) {
        Intent mobile1Intent04 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent04.setData(Uri.parse("tel:1146"));
        startActivity(mobile1Intent04);
    }

    public void clickMobile05(View view) {
        Intent mobile1Intent05 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent05.setData(Uri.parse("tel:1195"));
        startActivity(mobile1Intent05);
    }

    public void clickMobile06(View view) {
        Intent mobile1Intent06 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent06.setData(Uri.parse("tel:1196"));
        startActivity(mobile1Intent06);
    }

    public void clickMobile07(View view) {
        Intent mobile1Intent07 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent07.setData(Uri.parse("tel:1199"));
        startActivity(mobile1Intent07);
    }

    public void clickMobile08(View view) {
        Intent mobile1Intent08 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent08.setData(Uri.parse("tel:022412051"));
        startActivity(mobile1Intent08);
    }

    public void clickMobile09(View view) {
        Intent mobile1Intent09 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent09.setData(Uri.parse("tel:1650"));
        startActivity(mobile1Intent09);
    }

    public void clickMobile010(View view) {
        Intent mobile1Intent010 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent010.setData(Uri.parse("tel:022982387"));
        startActivity(mobile1Intent010);
    }

    public void clickMobile011(View view) {
        Intent mobile1Intent011 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent011.setData(Uri.parse("tel:0861302386"));
        startActivity(mobile1Intent011);
    }

    public void clickMobile012(View view) {
        Intent mobile1Intent012 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent012.setData(Uri.parse("tel:1784"));
        startActivity(mobile1Intent012);
    }

    public void clickMobile013(View view) {
        Intent mobile1Intent013 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent013.setData(Uri.parse("tel:1137"));
        startActivity(mobile1Intent013);
    }

    public void clickMobile014(View view) {
        Intent mobile1Intent014 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent014.setData(Uri.parse("tel:1644"));
        startActivity(mobile1Intent014);
    }


    public void clickMobile015(View view) {
        Intent mobile1Intent015 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent015.setData(Uri.parse("tel:1669"));
        startActivity(mobile1Intent015);
    }

    public void clickMobile016(View view) {
        Intent mobile1Intent016 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent016.setData(Uri.parse("tel:1646"));
        startActivity(mobile1Intent016);
    }

    public void clickMobile017(View view) {
        Intent mobile1Intent017 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent017.setData(Uri.parse("tel:1300"));
        startActivity(mobile1Intent017);
    }

    public void clickMobile018(View view) {
        Intent mobile1Intent018 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent018.setData(Uri.parse("tel:1356"));
        startActivity(mobile1Intent018);
    }

    public void clickMobile019(View view) {
        Intent mobile1Intent019 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent019.setData(Uri.parse("tel:1554"));
        startActivity(mobile1Intent019);
    }

    public void clickMobile020(View view) {
        Intent mobile1Intent020 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent020.setData(Uri.parse("tel:1555"));
        startActivity(mobile1Intent020);
    }

    public void clickMobile021(View view) {
        Intent mobile1Intent021 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent021.setData(Uri.parse("tel:192"));
        startActivity(mobile1Intent021);
    }
}
