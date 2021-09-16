package com.example.android_nang_cao_ps16752_hoangcongnhutvy.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android_nang_cao_ps16752_hoangcongnhutvy.R;

public class Lab1_Bai3 extends AppCompatActivity {

    Button btnPlay;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai3);

        btnPlay = findViewById(R.id.buttonPlay);
        editText = findViewById(R.id.editText);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab1_Bai3.this, Lab3IService.class);
                Bundle b = new Bundle();
                b.putString("edt", editText.getText().toString());
                intent.putExtra("viwhy", b);
                startService(intent);
            }
        });

    }
}