package com.example.networkmusic.Utils;

import org.xutils.http.annotation.HttpRequest;

/**
 * Created by Administrator on 2016/7/20.
 */
@HttpRequest(host = ServerInterface.BASE_URL, path = ServerInterface.HOT_URL)
public class HotParams extends BaseParams {

//   3=欧美
//    5=内地
//    6=港台
//    16=韩国
//    18=民谣
//    19=摇滚
//    23=销量
//    26=热歌

    public static final String OM = "3";
    public static final String ND = "5";
    public static final String GT = "6";
    public static final String HG = "16";
    public static final String MY = "18";
    public static final String YG = "19";
    public static final String XL = "23";
    public static final String RG = "26";


    //根据id来
    public HotParams(String id) {
        this.addBodyParameter("topid", id);
    }

}
