package com.example.eat_us_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class FridgeActivity extends AppCompatActivity {
    private ArrayList<Item> itemList = new ArrayList<>();
    private RecyclerView fridgeRecyclerView;
    private RecyclerViewAdapter fridgeAdapter;
    Button addfridge_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridge_main);

        addfridge_btn = findViewById(R.id.addfridge_btn);
        addfridge_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddFridgeActivity.class);
                startActivity(intent);
            }
        });
        /*
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(itemList);
        recyclerView.setAdapter(adapter);

        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextQuantity = findViewById(R.id.editTextQuantity);
        EditText editTextExpirationDate = findViewById(R.id.editTextExpirationDate);
        Button buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                int quantity = Integer.parseInt(editTextQuantity.getText().toString());
                String expirationDate = editTextExpirationDate.getText().toString();

                // Add item to list and notify adapter
                itemList.add(new Item(name, quantity, expirationDate));
                adapter.notifyDataSetChanged();

                // Clear input fields
                editTextName.setText("");
                editTextQuantity.setText("");
                editTextExpirationDate.setText("");
            }
        });
    } */

    }
}

