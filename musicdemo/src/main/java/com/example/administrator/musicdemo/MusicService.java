package com.example.administrator.musicdemo;

import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.administrator.musicdemo.utils.NotifationUtils;
import com.example.administrator.mylib.utils.LogUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */

public class MusicService extends Service implements MediaPlayer.OnCompletionListener {

    public static final int PLAY = 1;//播放音乐
    public static final String EXTENAR_INDEX = "index";
    public static final String EXTENAR_TYPE = "type";
    public static final int STOP = 2;//停止音乐
    public static final int PAUSE = 3;//暂停
    public static final int UPDATE_LIST = 4;

    public static final int MODE_HOT = 1;
    public static final int MODE_TYPE = 2;
    public static final int MODE_LOCAL = 3;

    public static int MODE = MODE_HOT;

    public static final int NOTIFA_ID = 0x88;

    //单曲循环
    public static final int PLAY_MODE_RANDOM = 11;
    public static final int PLAY_MODE_ORDER = 12;
    public int play_mode = PLAY_MODE_ORDER;

    int index;//在播放列表中的位置
    public boolean isPause;


    MediaPlayer mp;

    List<Uri> mList = new ArrayList<>();
    List<Uri> playList = new ArrayList<>();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    //播放音乐
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int type = intent.getIntExtra(EXTENAR_TYPE, -1);
        switch (type) {
            case PLAY:
                index = intent.getIntExtra(EXTENAR_INDEX, -1);
                if (index == -1)
                    break;
                play();
                break;
            case PAUSE:
                pause();
                break;
            case STOP:
                stop();
                break;
            case UPDATE_LIST:
                //更新
                mList.clear();
                mList.addAll(MyApp.getInstance().getMuiscList());
                playList.clear();
                playList.addAll(mList);
                break;
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private void pause() {
        if (mp != null) {
            if (mp.isPlaying()) {
                //更新通知
                mp.pause();
                isPause = true;
                sendNotification();
            } else {
                mp.start();
                isPause = false;
                sendNotification();
                //更新通知
            }
        }
    }

    private void play() { // -15%4=
        if (index < 0) {
            index = mList.size();
        } else if (index >= mList.size()) {
            index = 0;
        }

        if (mp != null)
            mp.reset();
        mp = MediaPlayer.create(this, mList.get(index));
        mp.start();
        mp.setOnCompletionListener(this);
        isPause = false;
        sendNotification();

    }

    private void sendNotification() {
        //在通知中去显示 播放条
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        String name = new File(mList.get(index).getPath()).getName();
        manager.notify(NOTIFA_ID, NotifationUtils.newNotifacation(this, name, isPause, play_mode));
    }


    private void stop() {
        if (mp != null) {
            if (mp.isPlaying()) {
                mp.stop();
            }
            mp.release();
        }
        mp = null;
        //关闭通知
    }

    @Override
    public void onCreate() {
        super.onCreate();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("down");
        intentFilter.addAction("up");
        intentFilter.addAction("mode");
        intentFilter.addAction("play");
        registerReceiver(receiver, intentFilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stop();
        unregisterReceiver(receiver);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        index++;
        play();
    }


    //广播接收者
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            LogUtils.e(intent.getAction());
            switch (intent.getAction()) {
                case "down":
                    index++;
                    play();
                    break;
                case "up":
                    index--;
                    play();
                    break;
                case "play":
                    pause();
                    break;
                case "mode":
                    //
                    play_mode = play_mode == PLAY_MODE_ORDER ? PLAY_MODE_RANDOM : PLAY_MODE_ORDER;
                    if (play_mode == PLAY_MODE_ORDER) {
                        mList.clear();
                        mList.addAll(playList);
                    } else {
                        //随机打乱
                        Collections.shuffle(mList);
                    }
                    //改变通知
                    sendNotification();
                    break;
            }
        }
    };
}

