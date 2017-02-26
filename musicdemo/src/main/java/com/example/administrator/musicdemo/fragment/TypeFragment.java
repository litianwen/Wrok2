package com.example.administrator.musicdemo.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.administrator.mylib.base.BaseFragment;

/**
 * Created by Administrator on 2016/11/10.
 */

public class TypeFragment extends BaseFragment {
    @Override
    public View getLayoutView() {
        return View.inflate(getContext(), android.R.layout.simple_list_item_1, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setBackgroundColor(Color.YELLOW);
    }
}
