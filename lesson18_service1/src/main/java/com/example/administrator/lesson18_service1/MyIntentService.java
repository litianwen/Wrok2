package com.example.administrator.lesson18_service1;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by Administrator on 2016/11/10.
 */

public class MyIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    //给工作线程一个名称
    public MyIntentService() {
        super("aaa");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //子线程
    }
}
