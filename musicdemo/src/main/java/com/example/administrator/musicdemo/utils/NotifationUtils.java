package com.example.administrator.musicdemo.utils;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;

import com.example.administrator.musicdemo.MusicService;
import com.example.administrator.musicdemo.R;

/**
 * Created by Administrator on 2016/11/10.
 */

public class NotifationUtils {

    public static final Notification newNotifacation(Context context, String name, boolean isPause, int mode) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.mipmap.icon);
        builder.setTicker("音乐正在播放....");
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.notification_layout);
        //SDK BUG
        views.setTextViewText(R.id.tv_musciname, name);
        views.setImageViewResource(R.id.iv_play, isPause ? R.mipmap.play : R.mipmap.pause);
        views.setImageViewResource(R.id.iv_mode, mode == MusicService.PLAY_MODE_ORDER ? R.mipmap.repert : R.mipmap.shuff);
        views.setOnClickPendingIntent(R.id.iv_down, getPI(context, "down"));
        views.setOnClickPendingIntent(R.id.iv_up, getPI(context, "up"));
        views.setOnClickPendingIntent(R.id.iv_play, getPI(context, "play"));
        views.setOnClickPendingIntent(R.id.iv_mode, getPI(context, "mode"));
        builder.setCustomBigContentView(views);
        Notification notifa = builder.build();
        notifa.flags = Notification.FLAG_NO_CLEAR;
        return notifa;
    }

    public static final PendingIntent getPI(Context context, String action) {
        Intent intent = new Intent(action);
        PendingIntent pi = PendingIntent.getBroadcast(context, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        return pi;
    }
}
