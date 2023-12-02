package com.example.eat_us_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FridgeActivity extends AppCompatActivity {
    private RecyclerView fridgeRecyclerView;
    private RecyclerViewAdapter fridgeAdapter;
    private ArrayList<FridgeItem> fridgeItemList;
    Button addfridge_btn;
    private static final int ADD_FRIDGE_REQUEST = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridge_main);

        fridgeItemList = new ArrayList<>();
        fridgeAdapter = new RecyclerViewAdapter(fridgeItemList);

        fridgeRecyclerView = findViewById(R.id.fridgeRecyclerView);
        fridgeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        fridgeRecyclerView.setAdapter(fridgeAdapter);

        addfridge_btn = findViewById(R.id.addfridge_btn);
        addfridge_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddFridgeActivity.class);
                startActivityForResult(intent, ADD_FRIDGE_REQUEST);
            }
        });

        EditText searchItem = findViewById(R.id.searchItem);
        searchItem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (fridgeAdapter != null) {
                    fridgeAdapter.filter(charSequence.toString());
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_FRIDGE_REQUEST && resultCode == RESULT_OK) {
            FridgeItem newItem = data.getParcelableExtra("FRIDGE_ITEM");
            if (newItem != null) {
                fridgeItemList.add(newItem);
                fridgeAdapter.notifyDataSetChanged();
            }
        }
    }
}

