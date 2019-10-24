package com.example.homeworktask2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private ArrayList<Food> foods;
    public void setData(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView image;
        public View view;
        public FoodViewHolder(@NonNull View itemView) {
            super (itemView);
            view = itemView;
            name = itemView.findViewById(R.id.foodName);
            image = itemView.findViewById(R.id.foodImage);

        }
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder (@NonNull FoodViewHolder holder, int position) {
        final Food foodAtPosition = foods.get(position);
        holder.name.setText(foodAtPosition.getName());
        holder.image.setImageResource(foodAtPosition.getImageId());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }
}
