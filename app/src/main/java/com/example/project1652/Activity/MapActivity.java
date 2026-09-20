package com.example.project1652.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

import com.example.project1652.R;


public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ConstraintLayout btn01 =findViewById(R.id.Bottom01);
        btn01.setOnClickListener(v -> startActivity(new Intent(MapActivity.this, MainActivity.class)));

        ConstraintLayout btn03 =findViewById(R.id.Bottom03);
        btn03.setOnClickListener(v -> startActivity(new Intent(MapActivity.this, SettingActivity.class)));

        ConstraintLayout btn1 =findViewById(R.id.Btn_01);
        btn1.setOnClickListener(v -> startActivity(new Intent(MapActivity.this, GaurdActivity.class)));

        ConstraintLayout btn2 =findViewById(R.id.Btn_02);
        btn2.setOnClickListener(v -> startActivity(new Intent(MapActivity.this, AutomechanicActivity.class)));
    }


}