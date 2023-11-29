package com.example.eat_us_app;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AddFridgeActivity extends AppCompatActivity{
    Button vdate_btn;
    Button category_btn;
    Button addsave_btn;

    DatePickerDialog datePickerDialog;
    TextView textView;
    public String vdate;
    private ImageView selectedCategoryImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfridge_main);

        vdate_btn = findViewById(R.id.vdate_btn);
        category_btn = findViewById(R.id.category_btn);
        addsave_btn = findViewById(R.id.addsave_btn);
        selectedCategoryImage = findViewById(R.id.selectedCategoryImage);

        category_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        addsave_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSaveToast();
            }
        });
    }

    public void showSaveToast(){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.save_toast_layout);

        WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
        params.width = 800;
        params.height = 1000;
        dialog.getWindow().setAttributes(params);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button goFridge_btn = dialog.findViewById(R.id.goFridge_btn);
        goFridge_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent intent = new Intent(getApplicationContext(), FridgeActivity.class);
                startActivity(intent);
            }
        });
        Button goBack_btn = dialog.findViewById(R.id.goBack_btn);
        goBack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.layout_toast);
    }

    private void updateSelectedCategoryImage(int drawableId){
        selectedCategoryImage.setImageResource(drawableId);
        selectedCategoryImage.setVisibility(View.VISIBLE);
    }

    public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayofMonth) {
                                vdate_btn.setText(year + "-" + (month + 1) + "-" + dayofMonth);
                                vdate = year + "-" + (month + 1) + "-" + dayofMonth;
                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.category_bottomsheet);

        LinearLayout fish = dialog.findViewById(R.id.fish);
        LinearLayout nuts = dialog.findViewById(R.id.nuts);
        LinearLayout fruit = dialog.findViewById(R.id.fruit);
        LinearLayout sauce = dialog.findViewById(R.id.sauce);
        LinearLayout egg = dialog.findViewById(R.id.egg);
        LinearLayout grain = dialog.findViewById(R.id.grain);
        LinearLayout drink = dialog.findViewById(R.id.drink);
        LinearLayout veggie = dialog.findViewById(R.id.veggie);
        LinearLayout meat = dialog.findViewById(R.id.meat);
        LinearLayout alcohol = dialog.findViewById(R.id.alcohol);
        LinearLayout milk = dialog.findViewById(R.id.milk);
        LinearLayout cheese = dialog.findViewById(R.id.cheese);

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.fish);
                dialog.dismiss();
            }
        });
        nuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.nuts);
                dialog.dismiss();
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.fruit);
                dialog.dismiss();
            }
        });

        sauce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.sauce);
                dialog.dismiss();
            }
        });

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.egg);
                dialog.dismiss();
            }
        });

        grain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.grain);
                dialog.dismiss();
            }
        });

        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.drink);
                dialog.dismiss();
            }
        });

        veggie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.veggie);
                dialog.dismiss();
            }
        });

        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.meat);
                dialog.dismiss();
            }
        });

        alcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.alcohol);
                dialog.dismiss();
            }
        });

        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.milk);
                dialog.dismiss();
            }
        });
        cheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSelectedCategoryImage(R.drawable.cheese);
                dialog.dismiss();
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }
}
