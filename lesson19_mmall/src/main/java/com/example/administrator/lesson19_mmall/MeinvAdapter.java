package com.example.administrator.lesson19_mmall;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.mylib.adapter.ListItemAdapter;
import com.example.administrator.mylib.utils.ImageUtils;

import java.util.List;

public class MeinvAdapter extends ListItemAdapter<MeiNv> {

    public MeinvAdapter(Context context, List<MeiNv> list) {
        super(context, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.lv_item, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        MeiNv meinv = getItem(position);
        holder.tv_time.setText(meinv.getCt());
        holder.tv_title.setText(meinv.getTitle());
        ImageUtils.bindView(meinv.getImg(), holder.iv_img);
        return convertView;
    }


    class ViewHolder {
        TextView tv_title, tv_time;
        ImageView iv_img;

        public ViewHolder(View layout) {
            tv_title = (TextView) layout.findViewById(R.id.tv_title);
            tv_time = (TextView) layout.findViewById(R.id.tv_time);
            iv_img = (ImageView) layout.findViewById(R.id.iv_img);
        }
    }
}
