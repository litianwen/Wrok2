package com.example.administrator.lesson17_broadcastreceiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/9.
 */

public class FragmentA extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentFilter intentfilter = new IntentFilter("fragment");
        getActivity().registerReceiver(receiver, intentfilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tv = new TextView(getContext());
        tv.setText("我是一个碎片");
        return tv;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            //能收到消息
            tv.setText("我接受到一条广播");
        }
    };
}
