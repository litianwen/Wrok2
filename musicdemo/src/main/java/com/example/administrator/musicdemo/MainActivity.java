package com.example.administrator.musicdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.example.administrator.musicdemo.fragment.HotFragment;
import com.example.administrator.musicdemo.fragment.LocalFragment;
import com.example.administrator.musicdemo.fragment.TypeFragment;
import com.example.administrator.mylib.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.rg_tab)
    RadioGroup rgTab;

    int currIndex = -1;
    Fragment[] fragments = new Fragment[3];

    @Override
    protected void initView() {
        rgTab.setOnCheckedChangeListener(this);
        rgTab.check(R.id.tab_rb_hot);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int tag = Integer.parseInt(findViewById(checkedId).getTag().toString());
        showFragment(tag);
    }

    //显示
    public void showFragment(int index) {
        if (index == currIndex)
            return;
        //隐藏上一页
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (currIndex != -1) {
            ft.hide(fragments[currIndex]);
        }
        if (fragments[index] == null) {
            //创建并且 添加进去
            createFragment(index);
            ft.add(R.id.fl_content, fragments[index]);
        } else {
            ft.show(fragments[index]);
        }
        ft.commit();
        currIndex = index;
    }

    private void createFragment(int index) {
        switch (index) {
            case 0:
                fragments[0] = new HotFragment();
                break;
            case 1:
                fragments[1] = new TypeFragment();
                break;
            case 2:
                fragments[2] = new LocalFragment();
                break;
        }
    }

}
