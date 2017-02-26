package com.example.administrator.lesson16_asynctask;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Bitmap> bitmaps = new ArrayList<>();

    //下载并且显示
    ListView lv;
    String[] urls = {
            "http://i2.s2.dpfile.com/2011-08-31/9375230_b.jpg(700x700)/thumb.jpg"
            , "http://p11.aipai.com/photo/935/31233935/photo/213/2904277/2904277_normal.jpg"
            , "http://img5.duitang.com/uploads/item/201504/16/20150416H0755_LfSyA.jpeg"
            , "http://t-1.tuzhan.com/86ace0afc48f/c-2/l/2013/08/26/01/a28777d739b74b128f644e5eb136df88.jpg"
            , "http://www.bz55.com/uploads/allimg/130531/1-1305310Z505.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);
        //执行异步任务操作必须在主线程
        //创建也必须在主线程
        MyAsyncTask task = new MyAsyncTask();
        task.execute(urls);
    }

    private BaseAdapter adapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return bitmaps.size();
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
            ImageView iv = new ImageView(getBaseContext());
            iv.setImageBitmap(bitmaps.get(position));
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setAdjustViewBounds(true);
            return iv;
        }
    };


    //params:开始任务的参数
    //progress:进度
    //result:返回结果
    class MyAsyncTask extends AsyncTask<String, Integer, List<Bitmap>> {
        ProgressDialog dialog;

        //在开始任务之前
        //初始化
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //主线程
            //只需要进度对话框
            dialog = new ProgressDialog(MainActivity.this);
            dialog.setMax(5);
            dialog.setMessage("正在下载");
            dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            dialog.setCancelable(false);
            dialog.show();
            Log.e("TAG", Thread.currentThread().getName());
        }

        @Override
        protected List<Bitmap> doInBackground(String... params) {
            //子线程
            //在这里做耗时任务
            Log.e("TAG", Thread.currentThread().getName());
            List<Bitmap> bitmaps = new ArrayList<>();
            for (int i = 0; i < params.length; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String path = params[i];
                //下载图片
                try {
                    URL url = new URL(path);
                    InputStream is = url.openStream();
                    Bitmap bmp = BitmapFactory.decodeStream(is);
                    bitmaps.add(bmp);
                    publishProgress(i + 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return bitmaps;
        }

        @Override
        protected void onPostExecute(List<Bitmap> bitmap) {
            //下载完毕后
            MainActivity.this.bitmaps = bitmap;
            MainActivity.this.adapter.notifyDataSetChanged();
            super.onPostExecute(bitmap);
            //关闭进度条
            dialog.dismiss();
            //主线程
            Log.e("TAG", Thread.currentThread().getName());

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //主线程
            //更新进度条
            dialog.setProgress(values[0]);
            Log.e("TAG", Thread.currentThread().getName());
        }
    }
}
