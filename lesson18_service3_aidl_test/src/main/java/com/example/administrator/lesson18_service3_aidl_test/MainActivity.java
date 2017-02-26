package com.example.administrator.lesson18_service3_aidl_test;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import aidl.IMathAidlInterface;

public class MainActivity extends AppCompatActivity {

    IMathAidlInterface iMathAidlInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start(View v) {
        bindService(new Intent("math"), conn, BIND_AUTO_CREATE);
    }

    public void add(View v) {
        try {
            int result = iMathAidlInterface.add(5, 7);
            Toast.makeText(this, result + "  ", Toast.LENGTH_SHORT).show();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //连接时
            iMathAidlInterface = IMathAidlInterface.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            //如果连接异常就会调用.
        }
    };
}
