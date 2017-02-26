package com.example.administrator.lesson18_service1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2016/11/10.
 */

public class MyService extends Service {



    @Override
    public void onCreate() {
        super.onCreate();
        //初始化操作
        System.out.println("MyService.onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("MyService.onStartCommand");
        //启动
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("MyService.onDestroy");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("MyService.onBind");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        System.out.println("MyService.onUnbind");
        return super.onUnbind(intent);
    }
}
