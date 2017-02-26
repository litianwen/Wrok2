package com.example.administrator.lesson16_asynctask;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.mylib.adapter.ListItemAdapter;
import com.example.administrator.mylib.utils.ImageUtils;

/**
 * Created by Administrator on 2016/11/8.
 */

public class MyBaseAdapter extends ListItemAdapter<String> {


    public MyBaseAdapter(Context context, String[] list) {
        super(context, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = new ImageView(mContext);
        ImageView iv = (ImageView) convertView;
        ImageUtils.bindView(mList.get(position), iv);
        return iv;
    }
}
