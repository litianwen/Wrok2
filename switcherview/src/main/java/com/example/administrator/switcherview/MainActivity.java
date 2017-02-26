package com.example.administrator.switcherview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<ImageView> mList = new ArrayList<>();

    int[] ids = {R.mipmap.a, R.mipmap.b, R.mipmap.d, R.mipmap.fbb, R.mipmap.lichen};

    SwitcherView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < ids.length; i++) {
            ImageView iv = new ImageView(this);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setImageResource(ids[i]);
            mList.add(iv);
        }
        sv = (SwitcherView) findViewById(R.id.sv);
        sv.setAdapter(adapter);
        sv.setOnPagerChangeListener(new SwitcherView.OnPagerChangeListener() {
            @Override
            public void onDraging(float degree) {
                Log.e("TAG", "当前角度" + degree);
            }

            @Override
            public void onReset() {
                Log.e("TAG", "复位");
            }

            @Override
            public void onPagerSwitcher(int postion) {
                Log.e("TAG", "滑动到了" + postion + "页面");
            }

            @Override
            public void onPagerSwitcherOver() {
                Log.e("TAG", "滑动完了");
            }
        });
    }


    private BaseAdapter adapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return mList.size();
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
            return mList.get(position % mList.size());
        }

    };
}
