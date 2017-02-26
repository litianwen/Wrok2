package com.example.administrator.lesson16_handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //除了在run方法中初始化的handler
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyThread thread = new MyThread();
        thread.start();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
            }
        });
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                //处理消息
            }
        };
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            Looper.prepare();
            Log.e("TAG", "---------准备完毕 开始循环");
            Looper.loop();
            Log.e("TAG", "---------执行不到这里");
        }
    }
}
