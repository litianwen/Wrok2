package com.example.administrator.lesson16_asynctask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/11/8.
 */

public class TwoActivity extends AppCompatActivity {
    String[] urls = {
            "http://i2.s2.dpfile.com/2011-08-31/9375230_b.jpg(700x700)/thumb.jpg"
            , "http://p11.aipai.com/photo/935/31233935/photo/213/2904277/2904277_normal.jpg"
            , "http://img5.duitang.com/uploads/item/201504/16/20150416H0755_LfSyA.jpeg"
            , "http://t-1.tuzhan.com/86ace0afc48f/c-2/l/2013/08/26/01/a28777d739b74b128f644e5eb136df88.jpg"
            , "http://www.bz55.com/uploads/allimg/130531/1-1305310Z505.jpg"
    };

    ListView lv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        MyBaseAdapter adapter = new MyBaseAdapter(this, urls);
        lv.setAdapter(adapter);
    }
}
