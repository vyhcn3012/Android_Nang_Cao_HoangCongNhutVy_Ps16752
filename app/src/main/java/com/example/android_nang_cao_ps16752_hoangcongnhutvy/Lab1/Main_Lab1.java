package com.example.android_nang_cao_ps16752_hoangcongnhutvy.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android_nang_cao_ps16752_hoangcongnhutvy.R;

public class Main_Lab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab1);
    }

    public void onpeBai1_Lab1(View view) {
        Intent intent = new Intent(Main_Lab1.this, Lab1_Bai1.class);
        startActivity(intent);
    }

    public void onpeBai2_Lab1(View view) {
        Intent intent = new Intent(Main_Lab1.this, Lab1_Bai2.class);
        startActivity(intent);
    }

    public void onpeBai3_Lab1(View view) {
        Intent intent = new Intent(Main_Lab1.this, Lab1_Bai3.class);
        startActivity(intent);
    }

    public void onpeBai4_Lab1(View view) {
        Intent intent = new Intent(Main_Lab1.this, Lab1_Bai4.class);
        startActivity(intent);
    }
}