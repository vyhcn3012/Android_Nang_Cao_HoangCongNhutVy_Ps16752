package com.example.android_nang_cao_ps16752_hoangcongnhutvy.Lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android_nang_cao_ps16752_hoangcongnhutvy.R;

public class Lab1_Bai4 extends AppCompatActivity {

    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai4);

        btnPlay = findViewById(R.id.buttonPlay);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CHANNEL_ID = "channel_id";
                CharSequence name = "chanel_name";
                int importance = NotificationManager.IMPORTANCE_DEFAULT;

                Intent i=new Intent(Lab1_Bai4.this, Main_Lab1.class);
                PendingIntent pe=PendingIntent.getActivity(getApplicationContext(),
                        0, i, PendingIntent.FLAG_CANCEL_CURRENT);



                Notification builder=new NotificationCompat.Builder(getApplicationContext())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("title")
                        .setContentText("Báo Thức nè")
                        .setChannelId(CHANNEL_ID)
                        .setContentIntent(pe)
                        .build();
                NotificationManager manager= (NotificationManager) getApplicationContext().getSystemService(getApplicationContext().NOTIFICATION_SERVICE);

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    NotificationChannel mchanel = new NotificationChannel(CHANNEL_ID,name,importance);
                    manager.createNotificationChannel(mchanel);
                }
                manager.notify(0,builder);
            }
        });

    }
}