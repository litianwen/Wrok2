package com.example.administrator.lesson19_javaconnection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JokeBean implements Serializable {

    int showapi_res_code;
    String showapi_res_error;
    Body showapi_res_body;

    class Body implements Serializable {
        int allNum;//所有数据
        int allPages;//所有页
        int currentPage; //当前页
        int maxResult;//一页显示20条
        int ret_code;
        List<Content> contentlist;

        @Override
        public String toString() {
            return "Body{" +
                    "allNum=" + allNum +
                    ", allPages=" + allPages +
                    ", currentPage=" + currentPage +
                    ", maxResult=" + maxResult +
                    ", ret_code=" + ret_code +
                    ", contentlist=" + contentlist +
                    '}';
        }

        class Content implements Serializable {
            @Override
            public String toString() {
                return "Content{" +
                        "ct='" + ct + '\'' +
                        ", id='" + id + '\'' +
                        ", text='" + text + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type + '\'' +
                        ", img=" + img +
                        '}';
            }

            String ct;
            String id;
            String text;
            String title;
            int type;  //文本笑话，图片笑话，动态图笑话
            String img;
        }

    }

    //静态的转换方法
    public static final JokeBean getBean(String json) throws JSONException {
        //  Joke joke = JSON.parseObject(json, Joke.class);
        //将json字符串，转换成对象
        //1.将最外部的 字符串转为json
        JSONObject jsonObject = new JSONObject(json);
        //2.建立返回的对象
        JokeBean bean = new JokeBean();
        //3.取外层数据  没有该键的时候，opt返回0，get报错
        bean.showapi_res_code = jsonObject.optInt("showapi_res_code");
        bean.showapi_res_error = jsonObject.optString("showapi_res_error");
        //创建内部对象
        Body body = bean.new Body();
        //4.取第二层数据,是一个对象
        JSONObject bodyObject = jsonObject.optJSONObject("showapi_res_body");
        //5.通过他去取数据
        body.allNum = bodyObject.optInt("allNum");
        body.allPages = bodyObject.optInt("allPages");
        body.currentPage = bodyObject.optInt("currentPage");
        body.maxResult = bodyObject.optInt("maxResult");
        body.ret_code = bodyObject.optInt("ret_code");
        JSONArray array = bodyObject.optJSONArray("contentlist");
        body.contentlist = new ArrayList<>();
        //通过数据遍历循环去取所有的对象
        for (int i = 0; i < array.length(); i++) {
            Body.Content content = body.new Content();
            //集合通过optXXX(index)的方法去取值
            JSONObject obj = array.optJSONObject(i);
            content.ct = obj.optString("ct");
            content.id = obj.optString("id");
            content.title = obj.optString("title");
            content.type = obj.optInt("type");
            if (content.type == 2)
                content.img = obj.optString("img");
            else
                content.text = obj.optString("text");
            body.contentlist.add(content);
        }
        bean.showapi_res_body = body;
        return bean;
    }

    @Override
    public String toString() {
        return "JokeBean{" +
                "showapi_res_body=" + showapi_res_body +
                ", showapi_res_error='" + showapi_res_error + '\'' +
                ", showapi_res_code=" + showapi_res_code +
                '}';
    }
}
