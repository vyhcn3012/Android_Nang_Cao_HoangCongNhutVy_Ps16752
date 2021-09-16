package com.example.android_nang_cao_ps16752_hoangcongnhutvy.Lab1;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.example.android_nang_cao_ps16752_hoangcongnhutvy.R;

public class MyService extends Service {

    MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }
}
