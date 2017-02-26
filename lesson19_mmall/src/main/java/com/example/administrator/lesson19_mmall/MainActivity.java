package com.example.administrator.lesson19_mmall;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.administrator.mylib.utils.LogUtils;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PullToRefreshBase.OnRefreshListener2<ScrollView>, AdapterView.OnItemClickListener {
    ListView lv;
    PullToRefreshScrollView ptrfsv;
    List<MeiNv> mList = new ArrayList<>();
    MeinvAdapter adapter;
    int page = 1;
    public static final String BASE_URL = "http://route.showapi.com/852-2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ptrfsv = (PullToRefreshScrollView) findViewById(R.id.ptrsv);

        lv = (ListView) findViewById(R.id.lv);
        adapter = new MeinvAdapter(this, mList);
        lv.setAdapter(adapter);
        //设置上拉加载
        ptrfsv.setMode(PullToRefreshBase.Mode.BOTH);
        ptrfsv.setOnRefreshListener(this);
        ptrfsv.setRefreshing();
        ptrfsv.smoothScrollTo(-50);
        doRequest();
        lv.setOnItemClickListener(this);
    }
    public void doRequest() {
        //请求数据
        String url = BASE_URL + "?";
        url += "showapi_appid=27267" + "&";
        url += "showapi_sign=4cc5b7586fa04ebab1193acc0d9ee1dd" + "&";
        url += "type=4002" + "&";
        url += "page=" + page;
        new QueryAsyncTask().execute(url);
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {
        //下拉刷新
        page = 1;
        mList.clear();
        doRequest();
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {
        //上拉加载
        page++;
        doRequest();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("meinv", mList.get(position));
        startActivity(intent);
    }


    class QueryAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(params[0]).openConnection();
                conn.setDoOutput(true);
                conn.connect();
                InputStream inputStream = conn.getInputStream();
                int len;
                byte[] buf = new byte[1024];
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                while ((len = inputStream.read(buf)) != -1) {
                    baos.write(buf, 0, len);
                }
                return new String(baos.toByteArray());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            //请求完毕
            ptrfsv.onRefreshComplete();
            super.onPostExecute(s);
            if (s == null) {
                Toast.makeText(getBaseContext(), "本地请求错误", Toast.LENGTH_LONG).show();
            }
            //解析数据
            try {
                newMeinvList(s);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    //解析数据
    public void newMeinvList(String jsonString) throws JSONException {
        //1.将字符串转为json
        List<MeiNv> list = new ArrayList<>();
        JSONObject jsonObject = new JSONObject(jsonString);
        if (jsonObject.optInt("showapi_res_code") == 0) {
            //成功了
            JSONObject body = jsonObject.optJSONObject("showapi_res_body");
            JSONObject pagebean = body.optJSONObject("pagebean");
            JSONArray array = pagebean.optJSONArray("contentlist");
            for (int i = 0; i < array.length(); i++) {
                JSONObject obj = array.optJSONObject(i);
                //创建对象
                MeiNv meinv = new MeiNv();
                //设置两个基本属性
                meinv.setCt(obj.optString("ct"));
                meinv.setTitle(obj.optString("title"));
                //获取所有的图片
                List<String> imgList = new ArrayList<>();
                JSONArray imgArray = obj.optJSONArray("list");
                for (int j = 0; j < imgArray.length(); j++) {
                    JSONObject imgObject = imgArray.optJSONObject(j);
                    imgList.add(imgObject.optString("middle"));
                    if (j == 0) {
                        meinv.img = imgObject.optString("middle");
                    }
                }
                //设置图片
                meinv.setImgList(imgList);
                list.add(meinv);
            }
            //list
            mList.addAll(list);
            adapter.notifyDataSetChanged();
            Log.e("TAG", list.toString());
        } else {
            LogUtils.e(jsonString);
            Toast.makeText(getBaseContext(), "请求接口错误", Toast.LENGTH_LONG).show();
        }
    }


}
