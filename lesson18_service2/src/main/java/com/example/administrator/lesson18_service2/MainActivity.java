package com.example.administrator.lesson18_service2;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    MyService myService;


    //内存泄漏
    private static MainActivity instance;

    public static MainActivity getInstance() {
        return instance;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_main);
        IntentFilter intentfilter = new IntentFilter("activity");
        registerReceiver(receiver, intentfilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
        unbindService(conn);
    }

    public void chuanchan(View v) {
        Intent intent = new Intent(this, MyService.class);
        intent.putExtra("msg", "activity向service传递一个hello service");
        startService(intent);
    }

    public void guangbo(View v) {
        sendBroadcast(new Intent("service").putExtra("msg", "你好，服务"));
    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("TAG", intent.getStringExtra("msg"));
        }
    };

    public void danli(View v) {
        //必须保证service不能为null
        //静态的变量，最后释放，不用的时候，手动将static变量=null;
        if (MyService.getInstance() != null) {
            MyService.getInstance().print("使用单例从activity中调用service的方法");
        }
    }

    public void bind(View v) {

        bindService(new Intent(this, MyService.class), conn, BIND_AUTO_CREATE);
    }

    ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService.MyBind bind = (MyService.MyBind) service;
            myService = bind.getService();

            bind.setCallback(new MyService.Callback() {
                @Override
                public void call() {
                    Log.e("TAG", "Service回调Activity");
                }

                @Override
                public void start() {
                    //音乐开始播放
                    finish();
                }
            });
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };


    public void send(View v) {
        myService.startMusic();
        LinearLayout lll = new LinearLayout(this);
       // lll.scrollTo(getResources().getDimension(R.dimen.a), getResources().getDimension(R.dimen.b));
    }

}
