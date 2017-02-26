package com.example.administrator.lesson19_javaconnection;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.mylib.utils.ImageUtils;

public class ShowActivity extends AppCompatActivity {
    JokeBean bean;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lv = new ListView(this);
        setContentView(lv);
        bean = (JokeBean) getIntent().getSerializableExtra("bean");
        lv.setAdapter(adapter);
    }
    private BaseAdapter adapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return bean.showapi_res_body.contentlist.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = View.inflate(getBaseContext(), R.layout.joke_item, null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else
                holder = (ViewHolder) convertView.getTag();
            JokeBean.Body.Content content = bean.showapi_res_body.contentlist.get(position);
            if (content.type == 1) {
                holder.tv_content.setVisibility(View.VISIBLE);
                holder.iv_content.setVisibility(View.GONE);
                holder.tv_content.setText(content.text);
            } else {
                holder.iv_content.setVisibility(View.VISIBLE);
                holder.tv_content.setVisibility(View.GONE);
                ImageUtils.bindView(content.img, holder.iv_content);
            }
            holder.tv_title.setText(content.title);
            holder.tv_time.setText(content.ct);
            return convertView;
        }

        class ViewHolder {

            TextView tv_title, tv_content, tv_time;
            ImageView iv_content;

            public ViewHolder(View convertView) {
                tv_title = (TextView) convertView.findViewById(R.id.tv_title);
                tv_content = (TextView) convertView.findViewById(R.id.tv_content);
                tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                iv_content = (ImageView) convertView.findViewById(R.id.iv_content);
            }
        }
    };

}
