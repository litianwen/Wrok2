package com.example.administrator.myview;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //java代码找到组件 帧动画 和平移动画 启动动画
        //帧动画
        TextView textView = (TextView) findViewById(R.id.tv);
        AnimationDrawable drawable = (AnimationDrawable) textView.getBackground();
        //补间动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.pigs);

        drawable.start();
        textView.startAnimation(animation);
    }
}
