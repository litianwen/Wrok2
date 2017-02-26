package com.example.administrator.lesson18_service1;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v) {
        //启动方式
        startService(new Intent(this, MyService.class));
    }

    public void stop(View v) {
        stopService(new Intent(this, MyService.class));
    }

    public void onBind(View v) {
        //BIND_AUTO_CREATE 绑定的同时，启动Service
        bindService(new Intent(this, MyService.class), conn, Service.BIND_AUTO_CREATE);
    }

    ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    public void unBind(View v) {
        unbindService(conn);
    }
}
