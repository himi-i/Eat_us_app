package com.example.eat_us_app;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AddFridgeActivity extends AppCompatActivity {
    Button vdate_btn;
    Button category_btn;
    Button addsave_btn;

    DatePickerDialog datePickerDialog;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfridge_main);
        vdate_btn = findViewById(R.id.vdate_btn);
        category_btn = findViewById(R.id.category_btn);
        addsave_btn = findViewById(R.id.addsave_btn);

        category_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialog();
            }
        });

        addsave_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddFridgeActivity.this, "저장이 완료되었습니다", Toast.LENGTH_SHORT).show();
            }
        });
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
                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.category_bottomsheet);

        /*
        LinearLayout fish = dialog.findViewById(R.id.fish);
        LinearLayout nuts = dialog.findViewById(R.id.nuts);
        LinearLayout fruit = dialog.findViewById(R.id.fruit);
        LinearLayout sauce = dialog.findViewById(R.id.sauce);
        LinearLayout egg = dialog.findViewById(R.id.egg);

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(AddFridgeActivity.this, "생선", Toast.LENGTH_SHORT).show();
            }
        });
        nuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(AddFridgeActivity.this, "견과류", Toast.LENGTH_SHORT).show();
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        sauce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
         */

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }
}
