package com.example.administrator.lesson17_broadcastreceiver1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //接受
        Log.e("TAG", "aaa收到了:" + intent.getStringExtra("msg"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //拦截广播
        abortBroadcast();
    }
}
