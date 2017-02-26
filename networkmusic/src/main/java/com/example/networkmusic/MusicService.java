package com.example.networkmusic;

/**
 * Created by Administrator on 2016/7/21.
 */

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.RemoteViews;

/**
 * 服务 后台
 */
public class MusicService extends Service {

    MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //用来连接
        return new MyBind();
    }

    class MyBind extends Binder {
        public MusicService getInstance() {
            return MusicService.this;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        IntentFilter filter = new IntentFilter();
        filter.addAction("play");
        registerReceiver(receiver, filter);
    }

    //播放
    public void play(String url) {
        showNotification(true);
        if (mp != null && mp.isPlaying()) //从新播放
            mp.reset();
        //弹出通知栏
        mp = MediaPlayer.create(this, Uri.parse(url));
        mp.start();
        Log.e("TAG", "-------------->>");

    }

    NotificationManager manager;

    public void showNotification(boolean isPlay) {
        //实现通知在通知栏
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.mipmap.defalut);
        // builder.setTicker("音乐播放中....");
        //布局组
        RemoteViews views = getRemoteView(isPlay);
        builder.setContent(views);
        //创建
        Notification notifi = builder.build();
        notifi.flags = Notification.FLAG_NO_CLEAR;
        //发出通知
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(5, notifi);
        Log.e("TAG", "---------->");
    }

    public RemoteViews getRemoteView(boolean b) {
        RemoteViews views = null;
        //if (b)
        views = new RemoteViews(this.getPackageName(), R.layout.notification_layout);
        views.setImageViewResource(R.id.play, b ? R.mipmap.pause : R.mipmap.play);
        //else
        //    views = new RemoteViews(this.getPackageName(), R.layout.notification_layout_play);
        Intent intent = new Intent("play");
        PendingIntent pd = PendingIntent.getBroadcast(this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        views.setOnClickPendingIntent(R.id.play, pd);
        return views;
    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("play")) {
                pause();
            }
        }
    };

    //  int index = 0;

//    //列表
//    public void play(List<String> urls) {
//        play(urls.get(index));
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stop();
        unregisterReceiver(receiver);
    }


    //暂停 与 继续播放
    public void pause() {
        if (mp != null) {
            if (mp.isPlaying()) {
                mp.pause();
                manager.cancel(5);
                showNotification(false);
            } else {
                mp.start(); //继续播放
                manager.cancel(5);
                showNotification(true);
            }
        }
    }

    //停止
    public void stop() {
        if (mp != null) {
            if (mp.isPlaying())
                mp.stop();
            mp.release();
            mp = null;
        }
    }

    //上一曲

    //下一曲
    //列表


}
