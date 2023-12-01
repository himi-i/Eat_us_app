package com.example.eat_us_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);

        TextView recipeTextView = findViewById(R.id.recipeTextView);

        // Recipe_list에서 전달한 레시피 이름을 받아옴
        String recipeName = getIntent().getStringExtra("recipeName");


    }
}
