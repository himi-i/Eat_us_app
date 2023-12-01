package com.example.eat_us_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class put_recipe extends AppCompatActivity{

    @Override
    protected  void onCreate ( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.put_recipe);

        ImageView recipePhotoImageView = findViewById(R.id.photo);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("recipePhotoUri")) {
            String photoUriString = intent.getStringExtra("recipePhotoUri");
            Uri photoUri = Uri.parse(photoUriString);
            recipePhotoImageView.setImageURI(photoUri);
        }

    }
}