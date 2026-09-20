package com.example.project1652.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.project1652.Adapter.CoursesAdapter;
import com.example.project1652.Domain.CoursesDomain;
import com.example.project1652.R;

import java.util.ArrayList;

public class AnnounceActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourceList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announce);

        initRecyclerView();

        View btn1 = findViewById(R.id.backBtn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(act1);
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("แอปกำลังอยู่ในช่วงพัฒนา\n\nจะปิดทำการอัพเดตในวันที่\n22/10/2567"));

        recyclerViewCourse = findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterCourceList = new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourceList);
    }
}