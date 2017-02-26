package com.example.networkmusic;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.networkmusic.frag.HotFragment;
import com.example.networkmusic.frag.LocalFragment;
import com.example.networkmusic.frag.SortFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private static MainActivity instance;

    public static MusicService getService() {
        return instance.service;
    }

    RadioGroup main_rg;

    MusicService service;

    List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_main);
        main_rg = (RadioGroup) findViewById(R.id.main_rg);
        fragments.add(new HotFragment());
        fragments.add(new SortFragment());
        fragments.add(new LocalFragment());
        main_rg.setOnCheckedChangeListener(this);
        main_rg.check(R.id.rb_hot);
        bindService(new Intent(this, MusicService.class), conn, BIND_AUTO_CREATE);
    }

    ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MusicService.MyBind bind = (MusicService.MyBind) iBinder;
            service = bind.getInstance();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            //当Service报错之后执行
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //服务解除连接
        unbindService(conn);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //替换Fragment
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        switch (checkedId) {
            case R.id.rb_hot:
                ft.replace(R.id.content, fragments.get(0));
                break;
            case R.id.rb_sort:
                ft.replace(R.id.content, fragments.get(1));
                break;
            case R.id.rb_local:
                ft.replace(R.id.content, fragments.get(2));
                break;
        }
        ft.commit();
    }
}
