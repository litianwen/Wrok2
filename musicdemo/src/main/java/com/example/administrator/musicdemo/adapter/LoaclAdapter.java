package com.example.administrator.musicdemo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.mylib.adapter.ListItemAdapter;

import java.io.File;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */

public class LoaclAdapter extends ListItemAdapter<File> {

    public LoaclAdapter(Context context, List<File> list) {
        super(context, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = new TextView(mContext);
        TextView tv = (TextView) convertView;
        tv.setTextColor(Color.WHITE);
        tv.setPadding(10, 10, 10, 10);
        tv.setText(mList.get(position).getName());
        return tv;
    }

}
