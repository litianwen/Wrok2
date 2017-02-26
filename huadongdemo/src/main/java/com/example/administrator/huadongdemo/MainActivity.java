package com.example.administrator.huadongdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= (TextView) findViewById(R.id.tv);
        tv.setText("在ByeBurger 1.0版本的时候，其实ByeBurger不叫ByeBurger的，而叫做ByeBurgerNavigationView, 由名字可以看出，他是扩展了系统的BottomNavigationView，可是这样做有许多弊端，比如强制用户使用了某个控件，这样通用性不强。第二，为了用户有更多的选择，加入了头部隐藏效果。所以说，这个项目已经不能被称为NavigationView。于是我将名称进行了修改。\n" +
                "\n" +
                "1.历史实现\n" +
                "\n" +
                "在1.0版本，我继承了BottomNavigationView。提供了两个方法，一个是show,另一个是hide.\n" +
                "\n" +
                " public void show() {\n" +
                "\n" +
                "    setY(mStartY);\n" +
                "    TranslateAnimation ta = new TranslateAnimation(0f, 0f,getMeasuredHeight(),0);\n" +
                "    ta.setDuration(300);\n" +
                "    ta.setAnimationListener(this);\n" +
                "    startAnimation(ta);\n" +
                "\n" +
                "  }\n" +
                "public void hide() {\n" +
                "    setY(mStartY + getMeasuredHeight());\n" +
                "\n" +
                "    TranslateAnimation ta = new TranslateAnimation(0f, 0f, -getMeasuredHeight(), getMeasuredHeight());\n" +
                "    ta.setDuration(300);\n" +
                "    ta.setAnimationListener(this);\n" +
                "    startAnimation(ta);\n" +
                "  }\n" +
                "实际上就是对Y坐标进行了一些处理。给个动画再让他改变他的Y坐标。来达到隐藏效果。(总之隐藏就是让用户看不到)\n" +
                "\n" +
                "然后利用Behavior，对NestScroll相关滑动进行监听，来改变ByeBurgerNavigationView的状态。\n" +
                "\n" +
                "public class ByeBurgerBehavior extends CoordinatorLayout.Behavior<ByeBurgerNavigationView> {\n" +
                "当然，这是1.0的实现，实用性比较低。所以有了1.1.0版本。\n" +
                "\n" +
                "2.更新实现\n" +
                "\n" +
                "整体思路就是利用自定义behavior去监听nestScroll的滑动，来让对应的View改变。之前在CoordinatorLayout 自定义Behavior并不难，由简到难手把手带你撸三款！ 中介绍过一种Behavior的使用方式，不熟悉的可以先过去看看。这里用到的是第二种，主要是针对NestScroll进行监听。\n" +
                "\n" +
                "首先，要自定义一个Behavior，他的泛型，也就是child view为View。 这也保证了它的通用性。\n" +
                "\n" +
                "public class ByeBurgerBottomBehavior extends CoordinatorLayout.Behavior<View> {}\n" +
                "其次来处理一下onStartNestedScroll()方法，他提供一个返回值，用于过滤掉滑动事件。这里我们只关心上下滑动。所以应该这样。\n" +
                "\n" +
                "@Override public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child,\n" +
                "      View directTargetChild, View target, int nestedScrollAxes) {\n" +
                "\n" +
                "    return (nestedScrollAxes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0;\n" +
                "  }\n" +
                "最后，在onNestedPreScroll()进行child的对应操作。首先要根据参数dy来判断上下滑动,然后再根据view当前的状态来显示或者隐藏目标View。\n" +
                "\n" +
                "public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View child, View target,\n" +
                "      int dx, int dy, int[] consumed) {\n" +
                "    //初始化一些参数\n" +
                "    if (isFirstMove) {\n" +
                "      isFirstMove = false;\n" +
                "      mAnimateHelper = AnimateHelper.get(child);\n" +
                "      mAnimateHelper.setStartY(child.getY());\n" +
                "      mAnimateHelper.setMode(AnimateHelper.MODE_BOTTOM);\n" +
                "    }\n" +
                "    if (Math.abs(dy) > mTouchSlop) {\n" +
                "      if (dy < 0) {\n" +
                "\n" +
                "        if (mAnimateHelper.getState() == AnimateHelper.STATE_HIDE) {\n" +
                "          mAnimateHelper.show();\n" +
                "        }\n" +
                "      } else if (dy > 0) {\n" +
                "        if (mAnimateHelper.getState() == AnimateHelper.STATE_SHOW) {\n" +
                "          mAnimateHelper.hide();\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}");
    }
}
