package com.example.android_nang_cao_ps16752_hoangcongnhutvy.Lab1;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Lab3IService extends IntentService {

    int count = 0;

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public Lab3IService(String name) {
        super(name);
    }

    public Lab3IService() {
        super("IntentServiceLab3");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Bundle b = intent.getBundleExtra("viwhy");
        String str = b.getString("edt");
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == 'a'){
                count++;
            }
        }
        Toast.makeText(this, "So luon ky tu A la: "+count, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "So luon ky tu A la: "+count, Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
