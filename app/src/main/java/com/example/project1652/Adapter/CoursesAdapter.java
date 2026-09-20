package com.example.project1652.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.project1652.Domain.CoursesDomain;
import com.example.project1652.R;

import java.util.ArrayList;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.Viewholder> {
    ArrayList<CoursesDomain> items;
    Context context;

    public CoursesAdapter(ArrayList<CoursesDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public CoursesAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflator = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_list, parent, false);
        context = parent.getContext();
        return new Viewholder(inflator);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesAdapter.Viewholder holder, int position) {
        holder.title.setText(items.get(position).getTitle());

        switch (position){
            case 0:
            holder.layout.setBackgroundResource(R.drawable.list_background_1);
            break;
            case 1:
                holder.layout.setBackgroundResource(R.drawable.list_background_2);
                break;
            case 2:
                holder.layout.setBackgroundResource(R.drawable.list_background_3);
                break;
            case 3:
                holder.layout.setBackgroundResource(R.drawable.list_background_4);
                break;
            case 4:
                holder.layout.setBackgroundResource(R.drawable.list_background_5);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView title;
        ConstraintLayout layout;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTxt);
            title.setTextSize(20);
            layout = itemView.findViewById(R.id.mail_layout);

        }
    }
}
