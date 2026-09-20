package com.example.project1652.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1652.R;


public class AutomechanicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automechanic);

        View btn0 = findViewById(R.id.backBtn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(act1);
            }
        });
    }
    public void map1(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/หนู+มอเตอร์/@16.8357459,100.2200938,51m/data=!3m1!1e3!4m6!3m5!1s0x30dfbda17a10a0a7:0xbd66d2f9f6be2070!8m2!3d16.8357187!4d100.2201755!16s%2Fg%2F11fszgd46b?entry=ttu&g_ep=EgoyMDI0MTAxNS4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map2(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/ร้านช้างมอเตอร์/@16.8346551,100.2203635,51m/data=!3m1!1e3!4m6!3m5!1s0x30dfbdcccbcf2f63:0xe82210f169114097!8m2!3d16.8346786!4d100.2204102!16s%2Fg%2F11vr4brtvz?entry=ttu&g_ep=EgoyMDI0MTAxNS4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map3(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/ร้านช่างนุ้ย+ซ่อมมอเตอร์ไซค์+ประตู3/@16.8238635,100.2156606,102m/data=!3m1!1e3!4m6!3m5!1s0x30dfbd006495bb6f:0xaf2b537ce52dc3a6!8m2!3d16.8238934!4d100.2159483!16s%2Fg%2F11vy2bchg_?entry=ttu&g_ep=EgoyMDI0MTAxNS4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }



}