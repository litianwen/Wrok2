package com.example.administrator.lesson19_javaconnection;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    CheckBox cb_image;
    EditText et_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        cb_image = (CheckBox) findViewById(R.id.cb_isImage);
        et_pager = (EditText) findViewById(R.id.et_pager);
    }


    public void conn1(View v) {
        //所有的请求网络必须在子线程
        new Thread() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://www.baidu.com");
                    //打开连接
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    //连接之前需要设置
                    conn.setDoInput(true);
                    conn.setDoOutput(true);
                    //连接
                    Log.e("TAG", "---->>");
                    InputStream is = conn.getInputStream();
                    //写出来
                    int len = 0;
                    byte[] buf = new byte[1024];
                    final StringBuffer sb = new StringBuffer();
                    while ((len = is.read(buf)) != -1) {
                        sb.append(new String(buf, 0, len));
                        Log.e("TAG", "----------------------///");
                    }
                    Log.e("TAG", "---->>" + sb.toString());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tv.setText(sb.toString());
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }


    public void conn2(View v) {
        //get请求使用？来拼接参数，多个参数使用&符号
        boolean isImage = cb_image.isChecked();
        String BaseUrl = "";
        if (isImage)
            BaseUrl = "http://route.showapi.com/341-2";//图片
        else
            BaseUrl = "http://route.showapi.com/341-1";//文本
        String pager = et_pager.getText().toString();
        int page = 1;
        if (!TextUtils.isEmpty(pager)) {
            try {
                page = Integer.parseInt(pager);
            } catch (Exception e) {
            }
        }
        if (page <= 0)
            page = 1;
        new MyAsyncTask().execute(BaseUrl + "?showapi_appid=13074&showapi_sign=ea5b4bf2e140498bb772d1bf2a51a7a0&page=" + page);
    }

    class MyAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                URL url = new URL(params[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setDoOutput(true);
                InputStream inputStream = url.openStream();
                //StringBuffer
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                int len = 0;
                byte[] buf = new byte[1024];
                while ((len = inputStream.read(buf)) != -1) {
                    os.write(buf, 0, len);
                }

                String result = new String(os.toByteArray(), "utf-8");
                Log.e("TAG", result);
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                final JokeBean bean = JokeBean.getBean(s);
                tv.setText(bean.toString());
                tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getBaseContext(), ShowActivity.class).putExtra("bean", bean));
                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
