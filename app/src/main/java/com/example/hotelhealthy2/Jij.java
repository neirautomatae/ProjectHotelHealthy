package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jij extends AppCompatActivity {

    private Button bkjijmind;
    private Button bkjajhmmd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jij);

        bkjijmind = findViewById(R.id.btnbkjij);
        bkjajhmmd = findViewById(R.id.btnbkjinhm);

        bkjijmind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bkjajhmmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkjaj01 = new Intent(Jij.this , MainActivity.class);
                finish();
                startActivity(bkjaj01);
            }
        });

    }

    //web.setData(Uri.parse(""));

    public void clickmaid(View view) {
        Intent web1 = new Intent(Intent.ACTION_VIEW);
        web1.setData(Uri.parse("http://www.prdmh.com/%E0%B8%82%E0%B9%88%E0%B8%B2%E0%B8%A7%E0%B8%AA%E0%B8%B2%E0%B8%A3/%E0%B8%82%E0%B9%88%E0%B8%B2%E0%B8%A7%E0%B9%81%E0%B8%88%E0%B8%81%E0%B8%81%E0%B8%A3%E0%B8%A1%E0%B8%AA%E0%B8%B8%E0%B8%82%E0%B8%A0%E0%B8%B2%E0%B8%9E%E0%B8%88%E0%B8%B4%E0%B8%95/1084-%E0%B8%81%E0%B8%A3%E0%B8%A1%E0%B8%AA%E0%B8%B8%E0%B8%82%E0%B8%A0%E0%B8%B2%E0%B8%9E%E0%B8%88%E0%B8%B4%E0%B8%95-%E0%B9%80%E0%B8%9C%E0%B8%A2%E0%B8%A7%E0%B8%B1%E0%B8%A2%E0%B8%97%E0%B8%B3%E0%B8%87%E0%B8%B2%E0%B8%99%E0%B9%80%E0%B8%AA%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B8%87%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%80%E0%B8%84%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B8%94%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%B9%E0%B8%87-%E0%B8%9E%E0%B8%A3%E0%B9%89%E0%B8%AD%E0%B8%A1%E0%B9%81%E0%B8%99%E0%B8%B0-10-%E0%B8%A7%E0%B8%B4%E0%B8%98%E0%B8%B5%E0%B8%94%E0%B8%B9%E0%B9%81%E0%B8%A5%E0%B9%83%E0%B8%88%E0%B9%83%E0%B8%AB%E0%B9%89%E0%B8%A1%E0%B8%B5%E0%B8%AA%E0%B8%B8%E0%B8%82%E0%B9%83%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B8%97%E0%B8%B3%E0%B8%87%E0%B8%B2%E0%B8%99.html%22));"));
        startActivity(web1);

}

    public void clickmaid2(View view) {

        Intent web2 = new Intent(Intent.ACTION_VIEW);
        web2.setData(Uri.parse("https://www.sanook.com/health/9309/"));
        startActivity(web2);

    }

    public void clickmaid3(View view) {
        Intent web3 = new Intent(Intent.ACTION_VIEW);
        web3.setData(Uri.parse("https://www.pobpad.com/%E0%B8%A0%E0%B8%B2%E0%B8%A7%E0%B8%B0%E0%B8%8B%E0%B8%B6%E0%B8%A1%E0%B9%80%E0%B8%A8%E0%B8%A3%E0%B9%89%E0%B8%B2-%E0%B8%9B%E0%B8%B1%E0%B8%8D%E0%B8%AB%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%82%E0%B8%A0%E0%B8%B2"));
        startActivity(web3);
    }

    public void clickmaid4(View view) {
        Intent web4 = new Intent(Intent.ACTION_VIEW);
        web4.setData(Uri.parse("https://med.mahidol.ac.th/ramachannel/home/article/%E0%B9%84%E0%B8%82%E0%B8%9B%E0%B8%B1%E0%B8%8D%E0%B8%AB%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%82%E0%B8%A0%E0%B8%B2%E0%B8%9E%E0%B8%88%E0%B8%B4%E0%B8%95-%E0%B8%81%E0%B8%B1%E0%B8%9A%E0%B8%AD%E0%B8%B2%E0%B8%81/"));
        startActivity(web4);
    }
    }

