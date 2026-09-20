package com.example.project1652.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1652.Adapter.CoursesAdapter;
import com.example.project1652.Domain.CoursesDomain;
import com.example.project1652.R;

import java.util.ArrayList;

public class UseActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourceList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use);

        initRecyclerView();

        View btn0 = findViewById(R.id.backBtn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(act1);
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain
                ("1.กดที่ปุุ่มไอคอน Map ด้านล่าง \n" + "2.เลือกหัวข้อที่จะใช้งานเพื่อแสดงเบอร์โทร \n" + "3.คลิกปุ่มเพื่อแสดงแผนที่บน Google Maps \n" + "4.กดปุ่มสีฟ้าเพื่อนำทางและแสดงตำแหล่งตัวผู้ใช้ \n"));

        recyclerViewCourse = findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterCourceList = new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourceList);
    }
}