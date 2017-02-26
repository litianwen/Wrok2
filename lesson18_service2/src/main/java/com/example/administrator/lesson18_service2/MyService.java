package com.example.administrator.lesson18_service2;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/10.
 */

public class MyService extends Service {

    private static MyService instance;

    public static MyService getInstance() {
        return instance;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBind();
    }


    class MyBind extends Binder {
        public MyService getService() {
            return MyService.this;
        }

        //设置回调
        public void setCallback(Callback callback) {
            MyService.this.callback = callback;
        }
    }

    Callback callback;

    public interface Callback {
        void call();

        void start();
    }


    public void startMusic() {
        //播放
        Toast.makeText(this, "音乐开始播放", Toast.LENGTH_SHORT).show();
        callback.start();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String msg = intent.getStringExtra("msg");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        IntentFilter intentfilter = new IntentFilter("service");
        registerReceiver(receiver, intentfilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("TAG", "接收到了activity发送的广播:" + intent.getStringExtra("msg"));
            sendBroadcast(new Intent("activity").putExtra("msg", "发送给activity的消息"));
        }
    };

    public void print(String msg) {
        Log.e("TAG", msg);
    }
}
