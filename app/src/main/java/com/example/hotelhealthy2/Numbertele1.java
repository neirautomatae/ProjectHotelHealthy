package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Numbertele1 extends AppCompatActivity {

    private Button backmutele1;
    private Button backhometele1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbertele1);
        backmutele1 = findViewById(R.id.btnbacktele1);
        backhometele1 = findViewById(R.id.btnhometele1);

        backmutele1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        backhometele1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backhometele1 = new Intent(Numbertele1.this , MainActivity.class);
                finish();
                startActivity(backhometele1);
            }
        });

    }



    public void clickMobile1(View view) {
        Intent mobileIntent1 = new Intent(Intent.ACTION_DIAL);
        mobileIntent1.setData(Uri.parse("tel:053910999"));
        startActivity(mobileIntent1);

    }

    public void clickMobile2(View view) {
        Intent mobileIntent2 = new Intent(Intent.ACTION_DIAL);
        mobileIntent2.setData(Uri.parse("tel:053910600"));
        startActivity(mobileIntent2);

    }

    public void clickMobile3(View view) {
        Intent mobileIntent1 = new Intent(Intent.ACTION_DIAL);
        mobileIntent1.setData(Uri.parse("tel:053917563"));
        startActivity(mobileIntent1);
    }

    public void clickMobile4(View view) {
        Intent mobileIntent4 = new Intent(Intent.ACTION_DIAL);
        mobileIntent4.setData(Uri.parse("tel:053603100"));
        startActivity(mobileIntent4);
    }

    public void clickMobile5(View view) {
        Intent mobileIntent5 = new Intent(Intent.ACTION_DIAL);
        mobileIntent5.setData(Uri.parse("tel:053711366"));
        startActivity(mobileIntent5);
    }

    public void clickMobile6(View view) {
        Intent mobileIntent6 = new Intent(Intent.ACTION_DIAL);
        mobileIntent6.setData(Uri.parse("tel:053717649"));
        startActivity(mobileIntent6);
    }

    public void clickMobile7(View view) {
        Intent mobileIntent7 = new Intent(Intent.ACTION_DIAL);
        mobileIntent7.setData(Uri.parse("tel:053603123"));
        startActivity(mobileIntent7);

    }

    public void clickMobile8(View view) {
        Intent mobileIntent8 = new Intent(Intent.ACTION_DIAL);
        mobileIntent8.setData(Uri.parse("tel:053819333"));
        startActivity(mobileIntent8);
    }

    public void clickMobile9(View view) {
        Intent mobileIntent9 = new Intent(Intent.ACTION_DIAL);
        mobileIntent9.setData(Uri.parse("tel:053880745"));
        startActivity(mobileIntent9);
    }

    public void clickMobile10(View view) {
        Intent mobileIntent10 = new Intent(Intent.ACTION_DIAL);
        mobileIntent10.setData(Uri.parse("tel:053870584"));
        startActivity(mobileIntent10);
    }

    public void clickMobile11(View view) {
        Intent mobileIntent11 = new Intent(Intent.ACTION_DIAL);
        mobileIntent11.setData(Uri.parse("tel:053471478"));
        startActivity(mobileIntent11);
    }

    public void clickMobile12(View view) {
        Intent mobileIntent12 = new Intent(Intent.ACTION_DIAL);
        mobileIntent12.setData(Uri.parse("tel:053220022"));
        startActivity(mobileIntent12);
    }

    public void clickMobile13(View view) {
        Intent mobileIntent13 = new Intent(Intent.ACTION_DIAL);
        mobileIntent13.setData(Uri.parse("tel:053363438"));
        startActivity(mobileIntent13);
    }

    public void clickMobile14(View view) {
        Intent mobileIntent14 = new Intent(Intent.ACTION_DIAL);
        mobileIntent14.setData(Uri.parse("tel:053455074"));
        startActivity(mobileIntent14);
    }

    public void clickMobile15(View view) {
        Intent mobileIntent15 = new Intent(Intent.ACTION_DIAL);
        mobileIntent15.setData(Uri.parse("tel:053221122"));
        startActivity(mobileIntent15);
    }

    public void clickMobile16(View view) {
        Intent mobileIntent16 = new Intent(Intent.ACTION_DIAL);
        mobileIntent16.setData(Uri.parse("tel:053411150"));
        startActivity(mobileIntent16);
    }

    public void clickMobile17(View view) {
        Intent mobileIntent17 = new Intent(Intent.ACTION_DIAL);
        mobileIntent17.setData(Uri.parse("tel:053459036"));
        startActivity(mobileIntent17);
    }

    public void clickMobile18(View view) {
        Intent mobileIntent18 = new Intent(Intent.ACTION_DIAL);
        mobileIntent18.setData(Uri.parse("tel:053217704"));
        startActivity(mobileIntent18);
    }

    public void clickMobile19(View view) {
        Intent mobileIntent19 = new Intent(Intent.ACTION_DIAL);
        mobileIntent19.setData(Uri.parse("tel:053920300"));
        startActivity(mobileIntent19);

    }

    public void clickMobile20(View view) {
        Intent mobileIntent20 = new Intent(Intent.ACTION_DIAL);
        mobileIntent20.setData(Uri.parse("tel:053999200"));
        startActivity(mobileIntent20);
    }

    public void clickMobile21(View view) {
        Intent mobileIntent21 = new Intent(Intent.ACTION_DIAL);
        mobileIntent21.setData(Uri.parse("tel:053852590"));
        startActivity(mobileIntent21);
    }

    public void clickMobile22(View view) {
        Intent mobileIntent22 = new Intent(Intent.ACTION_DIAL);
        mobileIntent22.setData(Uri.parse("tel:053467068"));
        startActivity(mobileIntent22);
    }

    public void clickMobile23(View view) {
        Intent mobileIntent23 = new Intent(Intent.ACTION_DIAL);
        mobileIntent23.setData(Uri.parse("tel:053241712"));
        startActivity(mobileIntent23);
    }

    public void clickMobile24(View view) {
        Intent mobileIntent24 = new Intent(Intent.ACTION_DIAL);
        mobileIntent24.setData(Uri.parse("tel:053475271"));
        startActivity(mobileIntent24);
    }

    public void clickMobile25(View view) {
        Intent mobileIntent25 = new Intent(Intent.ACTION_DIAL);
        mobileIntent25.setData(Uri.parse("tel:053297207"));
        startActivity(mobileIntent25);
    }

    public void clickMobile26(View view) {
        Intent mobileIntent26 = new Intent(Intent.ACTION_DIAL);
        mobileIntent26.setData(Uri.parse("tel:053801999"));
        startActivity(mobileIntent26);
    }

    public void clickMobile27(View view) {
        Intent mobileIntent27 = new Intent(Intent.ACTION_DIAL);
        mobileIntent27.setData(Uri.parse("tel:053495571"));
        startActivity(mobileIntent27);
    }

    public void clickMobile28(View view) {
        Intent mobileIntent28 = new Intent(Intent.ACTION_DIAL);
        mobileIntent28.setData(Uri.parse("tel:053270144"));
        startActivity(mobileIntent28);
    }

    public void clickMobile29(View view) {
        Intent mobileIntent29 = new Intent(Intent.ACTION_DIAL);
        mobileIntent29.setData(Uri.parse("tel:053469018"));
        startActivity(mobileIntent29);
    }

    public void clickMobile30(View view) {
        Intent mobileIntent30 = new Intent(Intent.ACTION_DIAL);
        mobileIntent30.setData(Uri.parse("tel:053487124"));
        startActivity(mobileIntent30);
    }

    public void clickMobile31(View view) {
        Intent mobileIntent31 = new Intent(Intent.ACTION_DIAL);
        mobileIntent31.setData(Uri.parse("tel:053249559"));
        startActivity(mobileIntent31);
    }

    public void clickMobile32(View view) {
        Intent mobileIntent32 = new Intent(Intent.ACTION_DIAL);
        mobileIntent32.setData(Uri.parse("tel:053355338"));
        startActivity(mobileIntent32);
    }

    public void clickMobile33(View view) {
        Intent mobileIntent33 = new Intent(Intent.ACTION_DIAL);
        mobileIntent33.setData(Uri.parse("tel:053451444"));
        startActivity(mobileIntent33);
    }

    public void clickMobile34(View view) {
        Intent mobileIntent34 = new Intent(Intent.ACTION_DIAL);
        mobileIntent34.setData(Uri.parse("tel:053498996"));
        startActivity(mobileIntent34);
    }

    public void clickMobile35(View view) {
        Intent mobileIntent35 = new Intent(Intent.ACTION_DIAL);
        mobileIntent35.setData(Uri.parse("tel:053442390"));
        startActivity(mobileIntent35);
    }

    public void clickMobile36(View view) {
        Intent mobileIntent36 = new Intent(Intent.ACTION_DIAL);
        mobileIntent36.setData(Uri.parse("tel:053321179"));
        startActivity(mobileIntent36);
    }

    public void clickMobile37(View view) {
        Intent mobileIntent37 = new Intent(Intent.ACTION_DIAL);
        mobileIntent37.setData(Uri.parse("tel:053461095"));
        startActivity(mobileIntent37);
    }

    public void clickMobile38(View view) {
        Intent mobileIntent38 = new Intent(Intent.ACTION_DIAL);
        mobileIntent38.setData(Uri.parse("tel:053225011"));
        startActivity(mobileIntent38);
    }

    public void clickMobile39(View view) {
        Intent mobileIntent39 = new Intent(Intent.ACTION_DIAL);
        mobileIntent39.setData(Uri.parse("tel:053280228"));
        startActivity(mobileIntent39);
    }

    public void clickMobile40(View view) {
        Intent mobileIntent40 = new Intent(Intent.ACTION_DIAL);
        mobileIntent40.setData(Uri.parse("tel:053999777"));
        startActivity(mobileIntent40);
    }

    public void clickMobile41(View view) {
        Intent mobileIntent41 = new Intent(Intent.ACTION_DIAL);
        mobileIntent41.setData(Uri.parse("tel:053485073"));
        startActivity(mobileIntent41);
    }

    public void clickMobile42(View view) {
        Intent mobileIntent42 = new Intent(Intent.ACTION_DIAL);
        mobileIntent42.setData(Uri.parse("tel:053477011"));
        startActivity(mobileIntent42);
    }

    public void clickMobile43(View view) {
        Intent mobileIntent43 = new Intent(Intent.ACTION_DIAL);
        mobileIntent43.setData(Uri.parse("tel:053512072"));
        startActivity(mobileIntent43);
    }

    public void clickMobile44(View view) {
        Intent mobileIntent44 = new Intent(Intent.ACTION_DIAL);
        mobileIntent44.setData(Uri.parse("tel:053975201"));
        startActivity(mobileIntent44);
    }

    public void clickMobile45(View view) {
        Intent mobileIntent45 = new Intent(Intent.ACTION_DIAL);
        mobileIntent45.setData(Uri.parse("tel:053976000"));
        startActivity(mobileIntent45);
    }

    public void clickMobile46(View view) {
        Intent mobileIntent46 = new Intent(Intent.ACTION_DIAL);
        mobileIntent46.setData(Uri.parse("tel:053555400"));
        startActivity(mobileIntent46);
    }

    public void clickMobile47(View view) {
        Intent mobileIntent47 = new Intent(Intent.ACTION_DIAL);
        mobileIntent47.setData(Uri.parse("tel:053984325"));
        startActivity(mobileIntent47);
    }

    public void clickMobile48(View view) {
        Intent mobileIntent48 = new Intent(Intent.ACTION_DIAL);
        mobileIntent48.setData(Uri.parse("tel:053096440"));
        startActivity(mobileIntent48);
    }

    public void clickMobile49(View view) {
        Intent mobileIntent49 = new Intent(Intent.ACTION_DIAL);
        mobileIntent49.setData(Uri.parse("tel:054409300"));
        startActivity(mobileIntent49);
    }

    public void clickMobile50(View view) {
        Intent mobileIntent50 = new Intent(Intent.ACTION_DIAL);
        mobileIntent50.setData(Uri.parse("tel:054409600"));
        startActivity(mobileIntent50);
    }

    public void clickMobile51(View view) {
        Intent mobileIntent51 = new Intent(Intent.ACTION_DIAL);
        mobileIntent51.setData(Uri.parse("tel:054409000"));
        startActivity(mobileIntent51);
    }

    public void clickMobile52(View view) {
        Intent mobileIntent52 = new Intent(Intent.ACTION_DIAL);
        mobileIntent52.setData(Uri.parse("tel:054495300"));
        startActivity(mobileIntent52);
    }

    public void clickMobile53(View view) {
        Intent mobileIntent53 = new Intent(Intent.ACTION_DIAL);
        mobileIntent53.setData(Uri.parse("tel:054411111"));
        startActivity(mobileIntent53);
    }

    public void clickMobile54(View view) {
        Intent mobileIntent54 = new Intent(Intent.ACTION_DIAL);
        mobileIntent54.setData(Uri.parse("tel:054237400"));
        startActivity(mobileIntent54);
    }

    public void clickMobile55(View view) {
        Intent mobileIntent55 = new Intent(Intent.ACTION_DIAL);
        mobileIntent55.setData(Uri.parse("tel:054261253"));
        startActivity(mobileIntent55);
    }

    public void clickMobile56(View view) {
        Intent mobileIntent56 = new Intent(Intent.ACTION_DIAL);
        mobileIntent56.setData(Uri.parse("tel:054291585"));
        startActivity(mobileIntent56);
    }

    public void clickMobile57(View view) {
        Intent mobileIntent57 = new Intent(Intent.ACTION_DIAL);
        mobileIntent57.setData(Uri.parse("tel:054266032"));
        startActivity(mobileIntent57);
    }

    public void clickMobile58(View view) {
        Intent mobileIntent58 = new Intent(Intent.ACTION_DIAL);
        mobileIntent58.setData(Uri.parse("tel:054019619"));
        startActivity(mobileIntent58);
    }


    public void clickMobile59(View view) {
        Intent mobileIntent59 = new Intent(Intent.ACTION_DIAL);
        mobileIntent59.setData(Uri.parse("tel:054286117"));
        startActivity(mobileIntent59);
    }

    public void clickMobile60(View view) {
        Intent mobileIntent60 = new Intent(Intent.ACTION_DIAL);
        mobileIntent60.setData(Uri.parse("tel:054268700"));
        startActivity(mobileIntent60);
    }

    public void clickMobile61(View view) {
        Intent mobileIntent61 = new Intent(Intent.ACTION_DIAL);
        mobileIntent61.setData(Uri.parse("tel:055296260"));
        startActivity(mobileIntent61);
    }

    public void clickMobile62(View view) {
        Intent mobileIntent62 = new Intent(Intent.ACTION_DIAL);
        mobileIntent62.setData(Uri.parse("tel:054289184"));
        startActivity(mobileIntent62);
    }

    public void clickMobile63(View view) {
        Intent mobileIntent63 = new Intent(Intent.ACTION_DIAL);
        mobileIntent63.setData(Uri.parse("tel:054839305"));
        startActivity(mobileIntent63);
    }
}