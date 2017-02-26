package com.example.administrator.musicdemo;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */

public class MyApp extends Application {

    //单例
    private static MyApp instance;

    public static MyApp getInstance() {
        return instance;
    }

    //播放列表
    private List<Uri> muiscList = new ArrayList<>();

    //喜欢的歌单
    //File文件去存储  .gd

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        //开启服务
        //加载音乐文件
        startService(new Intent(this, MusicService.class));
    }

    public List<Uri> getMuiscList() {
        return muiscList;
    }

    public void setMuiscList(List<Uri> muiscList) {
        this.muiscList = muiscList;
    }
}
