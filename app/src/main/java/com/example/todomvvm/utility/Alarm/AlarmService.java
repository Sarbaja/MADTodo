package com.example.todomvvm.utility.Alarm;


import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.example.todomvvm.MainActivity;
import com.example.todomvvm.R;
import com.example.todomvvm.utility.NotificationHandler;

public class AlarmService extends IntentService {

    public AlarmService() {
        super("AlarmService");
    }

    @Override
    public void onHandleIntent(Intent intent) {
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                new Intent(this, MainActivity.class), 0);

        NotificationHandler.sendNotification(this, "Alarm","You have a todo to complete.", 102, 0,contentIntent);
    }

}