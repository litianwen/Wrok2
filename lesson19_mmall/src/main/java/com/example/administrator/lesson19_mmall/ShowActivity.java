package com.example.administrator.lesson19_mmall;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.mylib.utils.ImageUtils;

import java.util.ArrayList;
import java.util.List;


public class ShowActivity extends AppCompatActivity {


    List<ImageView> mList = new ArrayList<>();

    MyAdapter adapter;
    MeiNv meinv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewPager vp = new ViewPager(this);
        vp.setBackgroundColor(Color.BLUE);
        setContentView(vp);

        meinv = getIntent().getParcelableExtra("meinv");
        Log.e("TAG", "---" + meinv.toString());

        adapter = new MyAdapter();
        vp.setAdapter(adapter);
        initView(meinv);
    }

    private void initView(MeiNv meinv) {
        for (int i = 0; i < meinv.getImgList().size(); i++) {
            ImageView iv = new ImageView(this);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setAdjustViewBounds(true);
            //在这里
            ImageUtils.bindView(meinv.getImgList().get(i), iv);
            mList.add(iv);
        }
        adapter.notifyDataSetChanged();
    }


    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }


        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(mList.get(position));
            return mList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(mList.get(position));
        }
    }
}
