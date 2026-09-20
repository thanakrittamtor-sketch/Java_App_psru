package com.example.project1652.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

import com.example.project1652.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AnnounceActivity.class)));

        ConstraintLayout btn2 =findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, UseActivity.class)));

        ConstraintLayout btn02 =findViewById(R.id.Bottom02);
        btn02.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MapActivity.class)));

        ConstraintLayout btn03 =findViewById(R.id.Bottom03);
        btn03.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SettingActivity.class)));
    }
}