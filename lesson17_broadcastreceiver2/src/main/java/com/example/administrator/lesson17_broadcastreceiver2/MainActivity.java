package com.example.administrator.lesson17_broadcastreceiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //需要手动的注册recevier
        //完成后必须手动的解绑
//        IntentFilter inflter = new IntentFilter("aaa");
//        inflter.setPriority(-1000);// -1000 1000
//        registerReceiver(receiver, inflter);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl, new FragmentA());
        fragmentTransaction.commit();

    }
    public void send(View v) {
        sendBroadcast(new Intent("fragment"));
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    //匿名类
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("TAG", "优先级低：应用程序2已经接受到了aaa的消息:" + intent.getStringExtra("msg"));
        }
    };

    public static class MyB extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

        }
    }
}
