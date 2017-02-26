package com.example.administrator.switcherview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ListAdapter;

/**
 * Created by Administrator on 2016/11/7.
 */

public class SwitcherView extends FrameLayout {

    public static final int MODE_NONE = 0;
    public static final int MODE_SINGLE = 1;
    public static final int MODE_MUI = 2;
    public int mode;

    //index 是 当前到了adater中的postion
    private int index = 0;

    ListAdapter adapter;

    public SwitcherView(Context context) {
        super(context);
    }

    public SwitcherView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setAdapter(ListAdapter adapter) {
        this.adapter = adapter;
        //条目的个数
        //adapter.getCount();
        if (adapter.getCount() == 0) {
            mode = MODE_NONE;
        } else if (adapter.getCount() == 1) {
            mode = MODE_SINGLE;
            View view = adapter.getView(0, null, null);
            this.addView(view);
            index = 1;
        } else {
            mode = MODE_MUI;
            //第2张图片在 layout中的 getChildAt几？？  0
            this.addView(adapter.getView(1, null, null));
            //操作下面这一个，也就是mList中的 第1个元素
            this.addView(adapter.getView(0, null, null));
            index = 2;
        }
    }

    float oldx;

    //当前摆动角度
    float oldDegree;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //判断mode
        float x = event.getX();
        if (mode != MODE_MUI)
            return false; //事件往下传递
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                oldx = x;
                oldDegree = 0;
                break;
            case MotionEvent.ACTION_MOVE:
                //需要去摆动第一个视图//1
                //最上面的视图
                getChildAt(1).startAnimation(swingAnim(oldDegree, (x - oldx) / 10));
                //角度赋值
                //0-30 30-40
                oldDegree = (x - oldx) / 10;
                if (onPagerChangeListener != null)
                    onPagerChangeListener.onDraging(oldDegree);
                break;
            case MotionEvent.ACTION_UP:
                //放手回来和离开
                if (Math.abs(oldDegree) > 30) {
                    //走了
                    float de = oldDegree > 0 ? 180 : -180;
                    Animation anim = swingAnim(oldDegree, de);
                    anim.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            //将上面的一张移除，加载一张
                            if (adapter.getCount() == index) {
                                mode = MODE_SINGLE;
                                if (onPagerChangeListener != null)
                                    onPagerChangeListener.onPagerSwitcherOver();
                            } else {
                                View view = adapter.getView(index, null, null);
                                removeViewAt(1);
                                addView(view, 0);
                                if (onPagerChangeListener != null) {
                                    onPagerChangeListener.onPagerSwitcher(index);
                                }
                                index++;
                            }

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    getChildAt(1).startAnimation(anim);
                } else {
                    //回来
                    getChildAt(1).startAnimation(swingAnim(oldDegree, 0));
                    if (onPagerChangeListener != null)
                        onPagerChangeListener.onReset();
                }
                break;
        }
        return true;//事件处理中
    }

    //摆动动画
    public Animation swingAnim(float start, float end) {
        Animation anim = new RotateAnimation(start, end, getWidth() / 2, getHeight());
        anim.setDuration(100);
        anim.setFillAfter(true);
        return anim;
    }

    public interface OnPagerChangeListener {
        public void onDraging(float degree);

        public void onReset();

        public void onPagerSwitcher(int postion);

        public void onPagerSwitcherOver();
    }

    private OnPagerChangeListener onPagerChangeListener;

    public void setOnPagerChangeListener(OnPagerChangeListener onPagerChangeListener) {
        this.onPagerChangeListener = onPagerChangeListener;
    }
}
