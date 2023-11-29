package com.example.eat_us_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private final ArrayList<Item> itemList;

    public RecyclerViewAdapter(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fridge_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.nameTextView.setText(item.getName());
        holder.numTextView.setText(String.valueOf(item.getQuantity()));
        holder.vdateTextView.setText(item.getVdate());
        holder.memoTextView.setText(item.getMemo());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView numTextView;
        TextView vdateTextView;
        TextView memoTextView;
        ImageView selectedCategoryImage;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            numTextView = itemView.findViewById(R.id.numTextView);
            vdateTextView = itemView.findViewById(R.id.vdateTextView);
            memoTextView = itemView.findViewById(R.id.memoTextView);
            selectedCategoryImage = itemView.findViewById(R.id.selectedCategoryImage);
        }
    }
}
