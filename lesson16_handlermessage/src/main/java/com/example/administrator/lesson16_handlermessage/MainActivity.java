package com.example.administrator.lesson16_handlermessage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageView iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
        iv2 = (ImageView) findViewById(R.id.iv2);
        //请求网络 开始下载图片
        //主线程不允许使用网络
        new Thread() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://img.alicdn.com/tps/i4/TB1vuWlNVXXXXayaFXXwu0bFXXX.png");
                    InputStream inputStream = url.openStream();
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    //永远不需要使用构造方法
                    Message msg = handler.obtainMessage();
                    msg.obj = bitmap;
                    msg.what = 1;
                    //你的手机的开机时间
                    handler.sendMessageAtTime(msg, System.currentTimeMillis() + 5000);
                    URL url2 = new URL("https://img.alicdn.com/tps/i4/TB18HMUNFXXXXcfXVXXwu0bFXXX.png");
                    InputStream inputStream2 = url2.openStream();
                    Bitmap bitmap2 = BitmapFactory.decodeStream(inputStream2);
                    Message msg2 = handler.obtainMessage();
                    msg2.what = 2;
                    msg2.obj = bitmap2;
                    handler.sendMessageDelayed(msg2, 3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //主线程
            switch (msg.what) {
                case 1:
                    iv.setImageBitmap((Bitmap) msg.obj);
                    break;
                case 2:
                    iv2.setImageBitmap((Bitmap) msg.obj);
                    break;
            }
        }
    };
}
