package com.example.administrator.lesson14_myprovider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //同一个工程中 去访问自己的 内容提供者
        ContentResolver cs = getContentResolver();
        ContentValues values = new ContentValues();
        values.put("username", "张三");
        values.put("password", "李四");
        Uri uri = cs.insert(Uri.parse(MyContentProvider.authority + "/user/6"), values);
        //知道他在哪里
        long id = ContentUris.parseId(uri);
        cs.query(uri, null, null, null, null);
    }
}
