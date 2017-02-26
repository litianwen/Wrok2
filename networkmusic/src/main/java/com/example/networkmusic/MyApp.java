package com.example.networkmusic;

import android.app.Application;
import android.content.Intent;

import org.xutils.x;

/**
 * Created by Administrator on 2016/7/20.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        startService(new Intent(this, MusicService.class));
        //监听
    }
}
