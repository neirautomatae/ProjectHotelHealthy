package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Numbertele2 extends AppCompatActivity {

    private Button backmutele2;
    private Button backhometele2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbertele2);
        backmutele2 = findViewById(R.id.btntelebk2);
        backhometele2 = findViewById(R.id.btnhometele2);

        backmutele2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbertele2.this.finish();
            }
        });

        backhometele2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backhometele2 = new Intent(Numbertele2.this , MainActivity.class);
                finish();
                startActivity(backhometele2);
            }
        });

    }



    public void clickMobile001(View view) {
        Intent mobile1Intent001 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent001.setData(Uri.parse("tel:1165"));
        startActivity(mobile1Intent001);
    }

    public void clickMobile002(View view) {
        Intent mobile1Intent002 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent002.setData(Uri.parse("tel:1330"));
        startActivity(mobile1Intent002);
    }

    public void clickMobile003(View view) {
        Intent mobile1Intent003 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent003.setData(Uri.parse("tel:1367"));
        startActivity(mobile1Intent003);
    }

    public void clickMobile004(View view) {
        Intent mobile1Intent004 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent004.setData(Uri.parse("tel:1556"));
        startActivity(mobile1Intent004);
    }

    public void clickMobile005(View view) {
        Intent mobile1Intent005 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent005.setData(Uri.parse("tel:022510385"));
        startActivity(mobile1Intent005);
    }

    public void clickMobile006(View view) {
        Intent mobile1Intent006 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent006.setData(Uri.parse("tel:022510582"));
        startActivity(mobile1Intent006);
    }

    public void clickMobile007(View view) {
        Intent mobile1Intent007 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent007.setData(Uri.parse("tel:022526913"));
        startActivity(mobile1Intent007);
    }

    public void clickMobile008(View view) {
        Intent mobile1Intent008 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent008.setData(Uri.parse("tel:1666"));
        startActivity(mobile1Intent008);
    }

    public void clickMobile009(View view) {
        Intent mobile1Intent009 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent009.setData(Uri.parse("tel:1667"));
        startActivity(mobile1Intent009);
    }

    public void clickMobile0010(View view) {
        Intent mobile1Intent0010 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0010.setData(Uri.parse("tel:053711222"));
        startActivity(mobile1Intent0010);
    }

    public void clickMobile0011(View view) {
        Intent mobile1Intent0011 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0011.setData(Uri.parse("tel:053719119"));
        startActivity(mobile1Intent0011);
    }

    public void clickMobile0012(View view) {
        Intent mobile1Intent0012 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0012.setData(Uri.parse("tel:053744572"));
        startActivity(mobile1Intent0012);
    }

    public void clickMobile0013(View view) {
        Intent mobile1Intent0013 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0013.setData(Uri.parse("tel:0843789534"));
        startActivity(mobile1Intent0013);
    }

    public void clickMobile0014(View view) {
        Intent mobile1Intent0014 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0014.setData(Uri.parse("tel:0537263689"));
        startActivity(mobile1Intent0014);
    }

    public void clickMobile0015(View view) {
        Intent mobile1Intent0015 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0015.setData(Uri.parse("tel:0537374100"));
        startActivity(mobile1Intent0015);
    }

    public void clickMobile0016(View view) {
        Intent mobile1Intent0016 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0016.setData(Uri.parse("tel:053723265"));
        startActivity(mobile1Intent0016);
    }

    public void clickMobile0017(View view) {
        Intent mobile1Intent0017 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0017.setData(Uri.parse("tel:0869145417"));
        startActivity(mobile1Intent0017);
    }

    public void clickMobile0018(View view) {
        Intent mobile1Intent0018 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0018.setData(Uri.parse("tel:0897016771"));
        startActivity(mobile1Intent0018);
    }

    public void clickMobile0019(View view) {
        Intent mobile1Intent0019 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0019.setData(Uri.parse("tel:0807225660"));
        startActivity(mobile1Intent0019);
    }

    public void clickMobile0020(View view) {
        Intent mobile1Intent0020 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0020.setData(Uri.parse("tel:0894313006"));
        startActivity(mobile1Intent0020);
    }

    public void clickMobile0021(View view) {
        Intent mobile1Intent0021 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0021.setData(Uri.parse("tel:0871767437"));
        startActivity(mobile1Intent0021);
    }

    public void clickMobile0022(View view) {
        Intent mobile1Intent0022 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0022.setData(Uri.parse("tel:053713648"));
        startActivity(mobile1Intent0022);
    }

    public void clickMobile0023(View view) {
        Intent mobile1Intent0023 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0023.setData(Uri.parse("tel:053742441"));
        startActivity(mobile1Intent0023);
    }

    public void clickMobile0024(View view) {
        Intent mobile1Intent0024 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0024.setData(Uri.parse("tel:1672"));
        startActivity(mobile1Intent0024);
    }

    public void clickMobile0025(View view) {
        Intent mobile1Intent0025 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0025.setData(Uri.parse("tel:053717433"));
        startActivity(mobile1Intent0025);
    }

    public void clickMobile0026(View view) {
        Intent mobile1Intent0026 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0026.setData(Uri.parse("tel:053717779"));
        startActivity(mobile1Intent0026);
    }

    public void clickMobile0027(View view) {
        Intent mobile1Intent0027 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0027.setData(Uri.parse("tel:053783445"));
        startActivity(mobile1Intent0027);
    }

    public void clickMobile0028(View view) {
        Intent mobile1Intent0028 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0028.setData(Uri.parse("tel:053791426"));
        startActivity(mobile1Intent0028);
    }

    public void clickMobile0029(View view) {
        Intent mobile1Intent0029 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0029.setData(Uri.parse("tel:053777111"));
        startActivity(mobile1Intent0029);
    }

    public void clickMobile0030(View view) {
        Intent mobile1Intent0030 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0030.setData(Uri.parse("tel:053790090"));
        startActivity(mobile1Intent0030);
    }

    public void clickMobile0031(View view) {
        Intent mobile1Intent0031 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0031.setData(Uri.parse("tel:053657034"));
        startActivity(mobile1Intent0031);
    }

    public void clickMobile0032(View view) {
        Intent mobile1Intent0032 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0032.setData(Uri.parse("tel:053675694"));
        startActivity(mobile1Intent0032);
    }

    public void clickMobile0033(View view) {
        Intent mobile1Intent0033 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0033.setData(Uri.parse("tel:053605295"));
        startActivity(mobile1Intent0033);
    }

    public void clickMobile0034(View view) {
        Intent mobile1Intent0034 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0034.setData(Uri.parse("tel:053711444"));
        startActivity(mobile1Intent0034);
    }

    public void clickMobile0035(View view) {
        Intent mobile1Intent0035 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0035.setData(Uri.parse("tel:053789508"));
        startActivity(mobile1Intent0035);
    }

    public void clickMobile0036(View view) {
        Intent mobile1Intent0036 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0036.setData(Uri.parse("tel:053767109"));
        startActivity(mobile1Intent0036);

    }

    public void clickMobile0037(View view) {
        Intent mobile1Intent0037 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0037.setData(Uri.parse("tel:053778199"));
        startActivity(mobile1Intent0037);
    }

    public void clickMobile0038(View view) {
        Intent mobile1Intent0038 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0038.setData(Uri.parse("tel:053731444"));
        startActivity(mobile1Intent0038);
    }

    public void clickMobile0039(View view) {
        Intent mobile1Intent0039 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0039.setData(Uri.parse("tel:053786004"));
        startActivity(mobile1Intent0039);
    }

    public void clickMobile0040(View view) {
        Intent mobile1Intent0040 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0040.setData(Uri.parse("tel:053737191"));
        startActivity(mobile1Intent0040);
    }

    public void clickMobile0041(View view) {
        Intent mobile1Intent0041 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0041.setData(Uri.parse("tel:053711588"));
        startActivity(mobile1Intent0041);
    }

    public void clickMobile0042(View view) {
        Intent mobile1Intent0042 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0042.setData(Uri.parse("tel:053761012"));
        startActivity(mobile1Intent0042);
    }

    public void clickMobile0043(View view) {
        Intent mobile1Intent0043 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0043.setData(Uri.parse("tel:053721515"));
        startActivity(mobile1Intent0043);
    }

    public void clickMobile0044(View view) {
        Intent mobile1Intent0044 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0044.setData(Uri.parse("tel:053799113"));
        startActivity(mobile1Intent0044);
    }

    public void clickMobile0045(View view) {
        Intent mobile1Intent0045 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0045.setData(Uri.parse("tel:053794405"));
        startActivity(mobile1Intent0045);
    }

    public void clickMobile0046(View view) {
        Intent mobile1Intent0046 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0046.setData(Uri.parse("tel:05379236"));
        startActivity(mobile1Intent0046);
    }

    public void clickMobile0047(View view) {
        Intent mobile1Intent0047 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0047.setData(Uri.parse("tel:053953155"));
        startActivity(mobile1Intent0047);
    }

    public void clickMobile0048(View view) {
        Intent mobile1Intent0048 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0048.setData(Uri.parse("tel:053608318"));
        startActivity(mobile1Intent0048);
    }

    public void clickMobile0049(View view) {
        Intent mobile1Intent0049 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0049.setData(Uri.parse("tel:053781466"));
        startActivity(mobile1Intent0049);
    }

    public void clickMobile0050(View view) {
        Intent mobile1Intent0050 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0050.setData(Uri.parse("tel:053270222"));
        startActivity(mobile1Intent0050);
    }

    public void clickMobile0051(View view) {
        Intent mobile1Intent0051= new Intent(Intent.ACTION_DIAL);
        mobile1Intent0051.setData(Uri.parse("tel:199"));
        startActivity(mobile1Intent0051);
    }

    public void clickMobile0052(View view) {
        Intent mobile1Intent0052= new Intent(Intent.ACTION_DIAL);
        mobile1Intent0052.setData(Uri.parse("tel:053233479"));
        startActivity(mobile1Intent0052);

    }

    public void clickMobile0053(View view) {
        Intent mobile1Intent0053= new Intent(Intent.ACTION_DIAL);
        mobile1Intent0053.setData(Uri.parse("tel:053270222"));
        startActivity(mobile1Intent0053);
    }

    public void clickMobile0054(View view) {
        Intent mobile1Intent0054= new Intent(Intent.ACTION_DIAL);
        mobile1Intent0054.setData(Uri.parse("tel:053247318"));
        startActivity(mobile1Intent0054);
    }

    public void clickMobile0055(View view) {
        Intent mobile1Intent0055= new Intent(Intent.ACTION_DIAL);
        mobile1Intent0055.setData(Uri.parse("tel:053459033"));
        startActivity(mobile1Intent0055);
    }

    public void clickMobile0056(View view) {
        Intent mobile1Intent0056= new Intent(Intent.ACTION_DIAL);
        mobile1Intent0056.setData(Uri.parse("tel:053248604"));
        startActivity(mobile1Intent0056);
    }

    public void clickMobile0057(View view) {
        Intent mobile1Intent0057 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0057.setData(Uri.parse("tel:053234051"));
        startActivity(mobile1Intent0057);
    }

    public void clickMobile0058(View view) {
        Intent mobile1Intent0058 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0058.setData(Uri.parse("tel:053475309"));
        startActivity(mobile1Intent0058);
    }

    public void clickMobile0059(View view) {
        Intent mobile1Intent0059 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0059.setData(Uri.parse("tel:053218445"));
        startActivity(mobile1Intent0059);
    }

    public void clickMobile0060(View view) {
        Intent mobile1Intent0060 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0060.setData(Uri.parse("tel:053219230"));
        startActivity(mobile1Intent0060);
    }

    public void clickMobile0061(View view) {
        Intent mobile1Intent0061 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0061.setData(Uri.parse("tel:053277477"));
        startActivity(mobile1Intent0061);
    }

    public void clickMobile0062(View view) {
        Intent mobile1Intent0062 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0062.setData(Uri.parse("tel:053332452"));
        startActivity(mobile1Intent0062);
    }

    public void clickMobile0063(View view) {
        Intent mobile1Intent0063 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0063.setData(Uri.parse("tel:053240289"));
        startActivity(mobile1Intent0063);
    }

    public void clickMobile0064(View view) {
        Intent mobile1Intent0064 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0064.setData(Uri.parse("tel:053311123"));
        startActivity(mobile1Intent0064);
    }

    public void clickMobile0065(View view) {
        Intent mobile1Intent0065 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0065.setData(Uri.parse("tel:053277510"));
        startActivity(mobile1Intent0065);

    }

    public void clickMobile0066(View view) {
        Intent mobile1Intent0066 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0066.setData(Uri.parse("tel:053491949"));
        startActivity(mobile1Intent0066);
    }

    public void clickMobile0067(View view) {
        Intent mobile1Intent0067 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0067.setData(Uri.parse("tel:053275715"));
        startActivity(mobile1Intent0067);
    }

    public void clickMobile0068(View view) {
        Intent mobile1Intent0068 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0068.setData(Uri.parse("tel:053487090"));
        startActivity(mobile1Intent0068);
    }

    public void clickMobile0069(View view) {
        Intent mobile1Intent0069 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0069.setData(Uri.parse("tel:053928028"));
        startActivity(mobile1Intent0069);
    }

    public void clickMobile0070(View view) {
        Intent mobile1Intent0070 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0070.setData(Uri.parse("tel:053321090"));
        startActivity(mobile1Intent0070);
    }

    public void clickMobile0071(View view) {
        Intent mobile1Intent0071 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0071.setData(Uri.parse("tel:053467110"));
        startActivity(mobile1Intent0071);
    }

    public void clickMobile0072(View view) {
        Intent mobile1Intent0072 = new Intent(Intent.ACTION_DIAL);
        mobile1Intent0072.setData(Uri.parse("tel:053477066"));
        startActivity(mobile1Intent0072);
    }
}
