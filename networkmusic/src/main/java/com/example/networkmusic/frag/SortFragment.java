package com.example.networkmusic.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.networkmusic.R;
import com.example.networkmusic.Utils.HotParams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/20.
 */
public class SortFragment extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;

    List<SortPagerFragment> fragmentList = new ArrayList<>();
    String[] titles = {"欧美", "内地", "港台", "韩国", "民谣", "摇滚", "销量"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = View.inflate(getContext(), R.layout.frag_sort, null);
        tabLayout = (TabLayout) layout.findViewById(R.id.tablayout);
        viewPager = (ViewPager) layout.findViewById(R.id.viewpager);
        //请求所有页面的数据
        // tabLayout.setTabTextColors(Color.WHITE, Color.BLUE);
        adapter = new MyPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return layout;
    }

    MyPagerAdapter adapter;

    class MyPagerAdapter extends FragmentPagerAdapter {


        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position % titles.length];
        }

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }

    private void initData() {
        if (fragmentList.size() == 0) {
            fragmentList.add(SortPagerFragment.getInstance(HotParams.OM));
            fragmentList.add(SortPagerFragment.getInstance(HotParams.ND));
            fragmentList.add(SortPagerFragment.getInstance(HotParams.GT));
            fragmentList.add(SortPagerFragment.getInstance(HotParams.HG));
            fragmentList.add(SortPagerFragment.getInstance(HotParams.MY));
            fragmentList.add(SortPagerFragment.getInstance(HotParams.YG));
            fragmentList.add(SortPagerFragment.getInstance(HotParams.XL));
        }
    }
}
