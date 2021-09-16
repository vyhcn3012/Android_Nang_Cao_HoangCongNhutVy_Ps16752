package com.example.android_nang_cao_ps16752_hoangcongnhutvy.Lab1;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Lab2Service extends Service {

    View view;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "new Service was Started", Toast.LENGTH_SHORT).show();
        Bundle b = intent.getBundleExtra("student");
        int StuId = b.getInt("StuID");
        String StuName = b.getString("StuName");
        String Class = b.getString("Class");

        String content = "Them SV Thanh Cong.\n Thong tin sinh vien:\n Sinh Vien:" + StuId + " " + StuName +
                "\nLop:" + Class;
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
