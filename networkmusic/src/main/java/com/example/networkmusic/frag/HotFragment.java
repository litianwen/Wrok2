package com.example.networkmusic.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.networkmusic.MainActivity;
import com.example.networkmusic.R;
import com.example.networkmusic.Utils.HotBean;
import com.example.networkmusic.Utils.HotBean.ShowapiResBodyBean.PagebeanBean.SonglistBean;
import com.example.networkmusic.Utils.HotHttpUtils;
import com.example.networkmusic.Utils.HotParams;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.List;

/**
 * Created by Administrator on 2016/7/20.
 */
public class HotFragment extends Fragment {

    ListView hot_lv; //显示后面的数据 除了前3条
    ImageView[] ivs = new ImageView[3];
    TextView[] tvs = new TextView[3];


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = View.inflate(getContext(), R.layout.frag_hot, null);
        //找到组件
        hot_lv = (ListView) layout.findViewById(R.id.hot_lv);
        for (int i = 0; i < 3; i++) {
            try {
                ivs[i] = (ImageView) layout.findViewById(R.id.class.getField("hot_iv_" + (i + 1)).getInt(null));
                tvs[i] = (TextView) layout.findViewById(R.id.class.getField("hot_tv_" + (i + 1)).getInt(null));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        hot_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //播放音乐
                String path = mList.get(i).getDownUrl();
                MainActivity.getService().play(path);
            }
        });
        return layout;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HotHttpUtils.getHotList(HotParams.RG, new HotHttpUtils.CallBack() {
            @Override
            public void callback(HotBean bean) {
                //有了数据 显示
                hotBean = bean;
                if (hot_lv != null)
                    setData();
            }
        });
    }

    //保存---歌曲地址
    HotBean hotBean;
    List<HotBean.ShowapiResBodyBean.PagebeanBean.SonglistBean> mList;//设置到ListView上


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (hotBean != null)
            setData();
    }

    public void setData() {
        mList = hotBean.getShowapi_res_body().getPagebean().getSonglist();
        for (int i = 0; i < 3; i++) {
            SonglistBean bean = mList.remove(0);
            //设置图片
            ImageOptions options = new ImageOptions.Builder().setCrop(false).build();
            x.image().bind(ivs[i], bean.getAlbumpic_big(), options);
            tvs[i].setText(bean.getSongname());
        }
        //设置适配器
        hot_lv.setAdapter(new MyBaseAdapter());
    }


    class MyBaseAdapter extends BaseAdapter {

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
            if (convertView == null) {
                convertView = View.inflate(getContext(), R.layout.listview_layout, null);
            }
            TextView songname = (TextView) convertView.findViewById(R.id.item_tv_songname);
            TextView singername = (TextView) convertView.findViewById(R.id.item_tv_singername);
            SonglistBean bean = mList.get(position);
            songname.setText(bean.getSongname());
            singername.setText(bean.getSingername());
            return convertView;
        }
    }
}
