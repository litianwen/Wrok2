package com.example.networkmusic.Utils;

import org.xutils.http.RequestParams;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/7/20.
 */
public class BaseParams extends RequestParams {

    //基类中 添加 系统级参数
    public BaseParams() {
        this.addBodyParameter("showapi_appid", "13074");
        this.addBodyParameter("showapi_sign", "ea5b4bf2e140498bb772d1bf2a51a7a0");
        String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(System.currentTimeMillis()));
        this.addBodyParameter("showapi_timestamp", time);
    }

}
