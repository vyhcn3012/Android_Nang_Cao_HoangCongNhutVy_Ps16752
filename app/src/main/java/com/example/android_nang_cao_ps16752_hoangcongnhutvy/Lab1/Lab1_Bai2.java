package com.example.android_nang_cao_ps16752_hoangcongnhutvy.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android_nang_cao_ps16752_hoangcongnhutvy.R;

public class Lab1_Bai2 extends AppCompatActivity {

    Button btnPlay, btnStop;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai2);

        btnPlay = findViewById(R.id.buttonPlay);
        btnStop = findViewById(R.id.buttonStop);
        tv2 = findViewById(R.id.textView);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab1_Bai2.this, Lab2Service.class);
                Bundle b = new Bundle();
                b.putInt("StuId", 1);
                b.putString("StuName", "VIWHY");
                b.putString("Class", "PS16752");
                intent.putExtra("student", b);
                startService(intent);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}