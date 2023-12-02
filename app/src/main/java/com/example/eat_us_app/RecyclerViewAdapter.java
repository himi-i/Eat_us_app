package com.example.eat_us_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private List<FridgeItem> fridgeItemList;
    private List<FridgeItem> fridgeItemListFull;

    public RecyclerViewAdapter(ArrayList<FridgeItem> itemList)
    {
        this.fridgeItemList = itemList;
        fridgeItemListFull = new ArrayList<>(itemList);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fridge_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FridgeItem item = fridgeItemList.get(position);
        holder.nameTextView.setText(item.getName());
        holder.numTextView.setText(String.valueOf(item.getQuantity()));
        holder.vdateTextView.setText(item.getVdate());
        holder.memoTextView.setText(item.getMemo());
        holder.categoryImage.setImageResource(item.getCategoryimage());
    }

    @Override
    public int getItemCount() {
        return fridgeItemList != null ? fridgeItemList.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, numTextView, vdateTextView, memoTextView;
        ImageView categoryImage;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            numTextView = itemView.findViewById(R.id.numTextView);
            vdateTextView = itemView.findViewById(R.id.vdateTextView);
            memoTextView = itemView.findViewById(R.id.memoTextView);
            categoryImage = itemView.findViewById(R.id.categoryImage);
        }
    }

    public void filter(String text){
        text = text.toLowerCase().trim();
        fridgeItemList.clear();
        if (text.isEmpty()){
            fridgeItemList.addAll(fridgeItemListFull);
        } else {
            for (FridgeItem item : fridgeItemListFull) {
                if (item.getName().toLowerCase().contains(text)) {
                    fridgeItemList.add(item);
                }
            }
        }
        notifyDataSetChanged();
    }
}
