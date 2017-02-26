package com.example.networkmusic.frag;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.networkmusic.MainActivity;
import com.example.networkmusic.R;
import com.example.networkmusic.Utils.HotBean;
import com.example.networkmusic.Utils.HotBean.ShowapiResBodyBean.PagebeanBean.SonglistBean;
import com.example.networkmusic.Utils.HotHttpUtils;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/20.
 */
public class SortPagerFragment extends Fragment {
    RecyclerView recyclerView;

    public static SortPagerFragment getInstance(String id) {
        SortPagerFragment fragment = new SortPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("id", id);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        String id = getArguments().getString("id");
        HotHttpUtils.getHotList(id, new HotHttpUtils.CallBack() {
            @Override
            public void callback(HotBean bean) {
                beans = bean.getShowapi_res_body().getPagebean().getSonglist();
                if (recyclerView != null)
                    recyclerView.setAdapter(new MyAdapter());
            }
        });
    }


    ArrayList<SonglistBean> beans;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this.beans = getArguments().getParcelableArrayList("key");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = View.inflate(getContext(), R.layout.frag_sortpager, null);
        recyclerView = (RecyclerView) layout.findViewById(R.id.recycler);
        //瀑布流
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        if (beans != null)
            recyclerView.setAdapter(new MyAdapter());
        return layout;
    }

    //适配器
    class MyAdapter extends RecyclerView.Adapter<VH> {

        @Override
        public VH onCreateViewHolder(ViewGroup parent, int viewType) {
            View layout = View.inflate(getContext(), R.layout.recycle_layout, null);
            VH vh = new VH(layout);
            return vh;
        }

        @Override
        public void onBindViewHolder(VH holder, final int position) {
            SonglistBean bean = beans.get(position);
            ImageOptions options = new ImageOptions.Builder().setCrop(false).build();
            x.image().bind(holder.sort_iv, bean.getAlbumpic_big(), options);
            holder.sort_tv.setText(bean.getSongname());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainActivity.getService().play(beans.get(position).getDownUrl());
                }
            });
        }

        @Override
        public int getItemCount() {
            return beans.size();
        }
    }

    class VH extends RecyclerView.ViewHolder {
        ImageView sort_iv;
        TextView sort_tv;

        public VH(View itemView) {
            super(itemView);
            sort_iv = (ImageView) itemView.findViewById(R.id.sort_iv);
            sort_tv = (TextView) itemView.findViewById(R.id.sort_tv);
        }
    }

}
