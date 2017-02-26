package com.example.administrator.lesson14_contentprovider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContentResolver cr = getContentResolver();
        Uri uri = ContactsContract.Contacts.CONTENT_URI;

        Cursor cursor = cr.query(uri, null, null, null, null);

        List<User> mList = new ArrayList<>();
        while (cursor.moveToNext()) {
            //联系人表中的，所有的用户的id号
            long id = cursor.getLong(cursor.getColumnIndex(ContactsContract.Contacts.NAME_RAW_CONTACT_ID));
            User user = new User();
            user.id = id;
            Log.e("TAG", id + "    ");
            //继续读取
            Cursor cursor2 = cr.query(ContactsContract.Data.CONTENT_URI, null, ContactsContract.Contacts.Data.RAW_CONTACT_ID + "=?", new String[]{id + ""}, null);
            while (cursor2.moveToNext()) {
                user.name = cursor2.getString(cursor2.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                user.phone.add(cursor2.getString(cursor2.getColumnIndex(ContactsContract.Data.DATA1)));
//                for (int i = 0; i < cursor2.getColumnCount(); i++) {
//                    //列名
//                    Log.e("TAG", "---------->>>" + cursor2.getColumnName(i) + "----------->>>" + cursor2.getString(i));
//                }
            }
            mList.add(user);
        }
        Log.e("TAG", mList.toString());

    }

    class User {
        long id;
        String name;
        List<String> phone = new ArrayList<>();

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone=" + phone +
                    '}';
        }
    }
}
