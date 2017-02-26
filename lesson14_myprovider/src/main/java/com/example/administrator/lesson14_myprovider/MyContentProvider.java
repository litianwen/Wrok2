package com.example.administrator.lesson14_myprovider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2016/11/7.
 */

//IPC 进程间通信
    //做framework
public class MyContentProvider extends ContentProvider {

    public static final String authority = "content://com.example.administrator.lesson14_myprovider";

    public static final int TABLE_USER = 1;
    public static final int TABLE_GOODS = 2;

    //全部查询
    public static final int QUERY_USER_ALL = 3;
    //只查询一条语句
    public static final int QUERY_USER_ID = 4;
    //后缀可以带path  id

    static UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);

    private static final int DELETE_USER_ID = 5;

    //用来匹配URI，判断用户在外部输入的URI是否符合规则
    static {
        //add
        matcher.addURI("com.example.administrator.lesson14_myprovider", "user", TABLE_USER);
        matcher.addURI("com.example.administrator.lesson14_myprovider", "goods", TABLE_GOODS);
        //#为id的通配符
        //query
        matcher.addURI("com.example.administrator.lesson14_myprovider", "user/#", QUERY_USER_ID);
        matcher.addURI("com.example.administrator.lesson14_myprovider", "user", QUERY_USER_ALL);

        //delete
        matcher.addURI("com.example.administrator.lesson14_myprovider", "user/#", DELETE_USER_ID);
//        String a = "content://com.example.administrator.lesson14_myprovider/user";
//        String b = "content://com.example.administrator.lesson14_myprovider/goods";
//        String c = "content://com.example.administrator.lesson14_myprovider/adsfa";
//        Log.e("TAG", matcher.match(Uri.parse(a)) + "   ");
//        Log.e("TAG", matcher.match(Uri.parse(b)) + "   ");
//        Log.e("TAG", matcher.match(Uri.parse(c)) + "   ");
        //update
    }

    MyOpenHepler helper;

    @Override
    public boolean onCreate() {
        helper = new MyOpenHepler();
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        //根据uri来判断用户想查询的数据
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = null;
        switch (matcher.match(uri)) {
            case QUERY_USER_ALL:
                cursor = db.query(MyOpenHepler.TABLE_USER, null, null, null, null, null, null, null);
                break;
            case QUERY_USER_ID:
                //查询某个ID
                //com.asd.asdf/user/10
                long id = ContentUris.parseId(uri);
                cursor = db.query(MyOpenHepler.TABLE_USER, null, "id=?", new String[]{id + ""}, null, null, null);
                break;
        }
        return cursor;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        //外部使用插入语句 带过来的数据
        long id = -1;
        SQLiteDatabase db = helper.getReadableDatabase();
        switch (matcher.match(uri)) {
            case TABLE_USER:
                id = db.insert(MyOpenHepler.TABLE_USER, null, values);
                Log.e("TAG", "插入USER成功");
                break;
            case TABLE_GOODS:
                id = db.insert(MyOpenHepler.TABLE_GOODS, null, values);
                Log.e("TAG", "插入商品成功");
                break;
            default:
                Log.e("TAG", "插入失败，URI不认识");
        }
        db.close();
        return ContentUris.withAppendedId(uri, id);//content://www.baidu.com/user/5
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        //不允许全部删除
        int row = -1;
        if (matcher.match(uri) == DELETE_USER_ID) {
            SQLiteDatabase db = helper.getReadableDatabase();
            long id = ContentUris.parseId(uri);
            row = db.delete(MyOpenHepler.TABLE_USER, "id=?", new String[]{id + ""});
        }
        return row;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }


    private class MyOpenHepler extends SQLiteOpenHelper {

        public static final String DB_NAME = "lesson14.db";
        public static final String TABLE_USER = "user";
        public static final String TABLE_GOODS = "goods";

        public MyOpenHepler() {
            super(getContext(), DB_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table " + TABLE_USER + " (id integer primary key autoincrement,username text not null,password text not null)");
            db.execSQL("create table " + TABLE_GOODS + " (id integer primary key autoincrement,goodsname text not null,value double not null)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

    class UserBean {
        long id;
        String username;
        String password;
    }

    class GoodsBean {
        long id;
        String goodsName;
        double value;
    }
}
