package com.example.administrator.musicdemo.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.administrator.musicdemo.MusicLoadAsyncTask;
import com.example.administrator.musicdemo.MusicService;
import com.example.administrator.musicdemo.MyApp;
import com.example.administrator.musicdemo.R;
import com.example.administrator.musicdemo.adapter.LoaclAdapter;
import com.example.administrator.mylib.base.BaseFragment;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.example.administrator.musicdemo.MusicService.MODE;
import static com.example.administrator.musicdemo.MusicService.MODE_LOCAL;
import static com.example.administrator.musicdemo.MusicService.PLAY;

/**
 * Created by Administrator on 2016/11/10.
 */

public class LocalFragment extends BaseFragment implements MusicLoadAsyncTask.OnFileFinishListener, PullToRefreshBase.OnRefreshListener2<ScrollView>, AdapterView.OnItemClickListener {

    @BindView(R.id.local_lv)
    ListView localLv;
    @BindView(R.id.ptrfsv)
    PullToRefreshScrollView ptrfsv;
    List<File> list;


    LoaclAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        freish();
    }


    public void freish() {
        new MusicLoadAsyncTask(this).execute();
    }

    /**
     * 在第一次打开的时候，加载本地File
     *
     * @return
     */

    @Override
    public View getLayoutView() {
        return View.inflate(getContext(), R.layout.fragment_local, null);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ptrfsv.setOnRefreshListener(this);
        //下拉
        if (list == null) {
            ptrfsv.smoothScrollTo(-50);
            //开始刷新
            ptrfsv.setRefreshing();
        }
        adapter = new LoaclAdapter(getContext(), list);
        localLv.setAdapter(adapter);
        localLv.setOnItemClickListener(this);
    }

    @Override
    public void fileFinish(List<File> list) {
        this.list = list;
        //通知
        if (ptrfsv != null) {
            //加载完毕
            ptrfsv.onRefreshComplete();
            adapter.setList(list);
        }
        List<Uri> uris = new ArrayList<>();
        for (File file : list) {
            uris.add(Uri.fromFile(file));
        }
        MyApp.getInstance().setMuiscList(uris);
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {
        freish();
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //启动服务播放音乐
        //将数据放入MyApp
        //播放哪一首
        if (MODE != MODE_LOCAL) {
            Intent intent = new Intent(getContext(), MusicService.class);
            //去更新
            intent.putExtra(MusicService.EXTENAR_TYPE, MusicService.UPDATE_LIST);
            getActivity().startService(intent);
        }

        //播放
        Intent intent = new Intent(getContext(), MusicService.class);
        intent.putExtra(MusicService.EXTENAR_TYPE, PLAY);
        intent.putExtra(MusicService.EXTENAR_INDEX, position);
        getActivity().startService(intent);
    }
}
