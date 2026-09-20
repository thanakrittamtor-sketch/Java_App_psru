package com.example.project1652.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.project1652.Adapter.CoursesAdapter;
import com.example.project1652.Domain.CoursesDomain;
import com.example.project1652.R;

import java.util.ArrayList;

public class SettingActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourceList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        initRecyclerView();
    }

    private void initRecyclerView() {

        ConstraintLayout btn01 =findViewById(R.id.Bottom01);
        btn01.setOnClickListener(v -> startActivity(new Intent(SettingActivity.this, MainActivity.class)));

        ConstraintLayout btn02 =findViewById(R.id.Bottom02);
        btn02.setOnClickListener(v -> startActivity(new Intent(SettingActivity.this, MapActivity.class)));
    }
}