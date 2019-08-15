package com.example.bookooserver.Helper;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;

import com.example.bookooserver.R;

public class NotificationHelper extends ContextWrapper {

    private static final String BOOKOO_CHANNEL_ID = "com.example.bookooserver.BOOKOO";
    private static final String BOOKOO_CHANNEL_NAME = "BOOKOO";

    private NotificationManager manager;

    public NotificationHelper(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
            createChannel();
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel BookooChannel = new NotificationChannel(BOOKOO_CHANNEL_ID,
                BOOKOO_CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT);
        BookooChannel.enableLights(false);
        BookooChannel.enableVibration(true);
        BookooChannel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);

        getManager().createNotificationChannel(BookooChannel);
    }

    public NotificationManager getManager() {
        if (manager == null)
            manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        return manager;
    }


    @TargetApi(Build.VERSION_CODES.O)
    public Notification.Builder getBookooChannelNotification(String title, String body, PendingIntent contentIntent, Uri soundUri)
    {
        return new Notification.Builder(getApplicationContext(),BOOKOO_CHANNEL_ID).setContentIntent(contentIntent)
                .setContentTitle(title)
                .setContentText(body)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setSound(soundUri)
                .setAutoCancel(false);
    }
}

