package com.example.administrator.lesson14_test;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContentResolver cr = getContentResolver();
//        ContentValues values = new ContentValues();
//        values.put("goodsname", "三星note7");
//        values.put("value", "-10000");
//        cr.insert(Uri.parse("content://com.example.administrator.lesson14_myprovider/goods"), values);
        Cursor cursor = cr.query(Uri.parse("content://com.example.administrator.lesson14_myprovider/user/6"), null, null, null, null);
        if (cursor == null)
            Log.e("TAG", "没有找到数据");
        else {
            while (cursor.moveToNext()) {
                String username = cursor.getString(cursor.getColumnIndex("username"));
                String password = cursor.getString(cursor.getColumnIndex("password"));
                Log.e("TAG", "---------" + username + "   " + password);
            }
        }
    }
}
