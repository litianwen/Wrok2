package com.example.networkmusic.Utils;

import android.util.Log;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.x;

/**
 * Created by Administrator on 2016/7/20.
 */
public class HotHttpUtils {

    public static final void getHotList(String id, final CallBack callBack) {
        HotParams params = new HotParams(id);
        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("TAG", "--------------------" + result);
                Gson gson = new Gson();
                HotBean bean = gson.fromJson(result, HotBean.class);
                Log.e("TAG", "--------------" + bean.toString());
                if (callBack != null)
                    callBack.callback(bean);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.e("TAG", "----------------" + ex.getMessage());

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {
                Log.e("TAG", "完成-------");
            }
        });
    }


    public interface CallBack {
        public void callback(HotBean bean);
    }
}
