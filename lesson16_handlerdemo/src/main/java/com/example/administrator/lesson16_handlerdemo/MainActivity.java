package com.example.administrator.lesson16_handlerdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int[] colors = {Color.BLUE, Color.GRAY, Color.BLACK, Color.GREEN, Color.YELLOW, Color.CYAN, Color.DKGRAY, Color.LTGRAY,
            Color.MAGENTA, Color.WHITE, Color.RED};
    int index = 0;

    LinearLayout layout;
    //轮播
    //优化搜索
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < 11; i++) {
            View view = new View(this);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);
            lp.weight = 1;
            view.setLayoutParams(lp);
            view.setBackgroundColor(colors[i]);
            layout.addView(view);
        }
        setContentView(layout);
        hanlder.sendEmptyMessageDelayed(1, 1000);
    }


    Handler hanlder = new Handler() {
        //处理消息
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                hanlder.sendEmptyMessageDelayed(1, 100);
                index++;
                for (int i = 0; i < layout.getChildCount(); i++) {
                    layout.getChildAt(i).setBackgroundColor(colors[(index + i) % colors.length]);
                }
            }
        }
    };
}
