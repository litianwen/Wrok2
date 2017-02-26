package com.example.administrator.diymode;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ListAdapter;

/**
 * Created by Administrator on 2016/11/7.
 */

public class FrameView extends FrameLayout {

    public static final int MODE_SINGLE = 1;
    public static final int MODE_NONE = 0;
    public static final int MODE_MIU = 2;

    int index;

    int mode = MODE_NONE;


    ListAdapter adapter;


    public FrameView(Context context) {
        super(context);
    }

    public FrameView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void setAdapter(ListAdapter adapter) {
        this.adapter = adapter;
        if (adapter.getCount() == 0) {
            mode = MODE_NONE;
            return;
        } else if (adapter.getCount() == 1) {
            this.addView(adapter.getView(0, null, null));
            mode = MODE_SINGLE;
        } else {
            this.addView(adapter.getView(1, null, null));
            this.addView(adapter.getView(0, null, null));
            mode = MODE_MIU;
            index = 2;
        }
    }

    float oldx;
    float oldDegress;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (mode != MODE_MIU)
            return false;
        float x = event.getX();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                oldx = x;
                break;
            case MotionEvent.ACTION_MOVE:
                // if (Math.abs(x - oldx) > 10) { //有滑动
                this.getChildAt(1).startAnimation(getAnim(oldDegress, (x - oldx) / 10));
                oldDegress = (x - oldx) / 10;
                Log.e("TAG", "---" + x + "  " + oldx + "  " + oldDegress);
                //oldx = x;
                // }
                break;
            case MotionEvent.ACTION_UP:
                //检测角度
                if (Math.abs(oldDegress) < 30) {
                    //还原
                    this.getChildAt(1).startAnimation(reAnim());

                } else {
                    //下一视图
                    Animation anim = go(oldDegress);
                    anim.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            FrameView.this.removeViewAt(1);
                            if (adapter.getCount() > index) {
                                FrameView.this.addView(adapter.getView(index, null, null), 0);
                                index++;
                            } else {
                                mode = MODE_SINGLE;
                            }
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    this.getChildAt(1).startAnimation(anim);
                }
                oldDegress = 0;
                break;
        }
        return true;
    }

    private Animation go(float old) {
        float go = old < 0 ? -180 : 180;
        Animation anim = new RotateAnimation(old, go, getWidth() / 2, getHeight());
        anim.setDuration(100);
        anim.setFillAfter(true);
        return anim;
    }


    public Animation getAnim(float old, float degress) {
        Animation anim = new RotateAnimation(old, degress, getWidth() / 2, getHeight());
        anim.setDuration(100);
        anim.setFillAfter(true);
        return anim;
    }

    public Animation reAnim() {
        Animation anim = new RotateAnimation(oldDegress, 0, getWidth() / 2, getHeight());
        anim.setDuration(100);
        anim.setFillAfter(true);
        return anim;
    }
}
