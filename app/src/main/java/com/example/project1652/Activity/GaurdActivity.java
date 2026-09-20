package com.example.project1652.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.project1652.R;


public class GaurdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guard);

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
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'49.0\"N+100°12'10.8\"E/@16.830276,100.2023489,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.830276!4d100.202994?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map2(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'44.7\"N+100°12'17.2\"E/@16.829086,100.2041349,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.829086!4d100.20478?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map3(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'38.0\"N+100°12'22.1\"E/@16.827219,100.2054959,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.827219!4d100.206141?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map4(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'34.5\"N+100°12'23.4\"E/@16.8262032,100.2064459,51m/data=!3m1!1e3!4m4!3m3!8m2!3d16.826261!4d100.206499?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map5(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'38.5\"N+100°12'33.5\"E/@16.827368,100.2086609,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.827368!4d100.209306?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map6(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'40.8\"N+100°12'40.9\"E/@16.827991,100.2107169,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.827991!4d100.211362?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map7(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'43.9\"N+100°12'48.3\"E/@16.82885,100.2127739,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.82885!4d100.213419?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map8(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°50'06.5\"N+100°12'54.5\"E/@16.835136,100.2144969,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.835136!4d100.215142?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }

    public void map9(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/16°49'26.7\"N+100°12'55.9\"E/@16.824076,100.2148869,203m/data=!3m2!1e3!4b1!4m4!3m3!8m2!3d16.824076!4d100.215532?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }
    public void map10(View view) {
        Intent mapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.th/maps/place/ComputerEngineering@PSRU/@16.8348506,100.2136056,19.75z/data=!4m6!3m5!1s0x30dfbd55f80db695:0x33a0ef3a0f888194!8m2!3d16.834799!4d100.2133145!16s%2Fg%2F11jpdv7m65?hl=th&entry=ttu&g_ep=EgoyMDI0MTAxNi4wIKXMDSoASAFQAw%3D%3D"));
        startActivity(mapp);
    }


}