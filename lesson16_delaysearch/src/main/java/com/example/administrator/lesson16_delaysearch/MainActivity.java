package com.example.administrator.lesson16_delaysearch;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    public static final String[] search =
            {
                    "abstract	表明类或者成员方法具有抽象属性",
                    "assert	用来进行程序调试",
                    "boolean	基本数据类型之一，布尔类型",
                    "break	提前跳出一个kua",
                    "byte	基本数据类型之一，字节类型",
                    "case	用在switch语句之中，表示其中的一个分支",
                    "catch	用在异常处理中，用来捕捉异常",
                    "char	基本数据类型之一，字符类型",
                    "class	类",
                    "const	保留关键字，没有具体含义",
                    "continue	回到一个块的开始处",
                    "default	默认，例如，用在switch语句中，表明一个默认的分支",
                    "do	用在do-while循环结构中",
                    "double	基本数据类型之一，双精度浮点数类型",
                    "else	用在条件语句中，表明当条件不成立时的分支",
                    "enum	枚举",
                    "extends	表明一个类型是另一个类型的子类型，这里常见的类型有类和接口",
                    "final	用来说明最终属性，表明一个类不能派生出子类，或者成员方法不能被覆盖，或者成员域的值不能被改变",
                    "finally	用于处理异常情况，用来声明一个基本肯定会被执行到的语句块",
                    "float	基本数据类型之一，单精度浮点数类型",
                    "for	一种循环结构的引导词",
                    "goto	保留关键字，没有具体含义",
                    "if	条件语句的引导词",
                    "implements	表明一个类实现了给定的接口",
                    "import	表明要访问指定的类或包",
                    "instanceof	用来测试一个对象是否是指定类型的实例对象",
                    "int	基本数据类型之一，整数类型",
                    "interface	接口",
                    "long	基本数据类型之一，长整数类型",
                    "native	用来声明一个方法是由与计算机相关的语言（如C/C++/FORTRAN语言）实现的",
                    "new	用来创建新实例对象",
                    "null	用来标识一个不确定的对象",
                    "package	包",
                    "private	一种访问控制方式：私用模式",
                    "protected	一种访问控制方式：保护模式",
                    "public	一种访问控制方式：共用模式",
                    "return	从成员方法中返回数据",
                    "short	基本数据类型之一,短整数类型",
                    "static	表明具有静态属性",
                    "strictfp	用来声明FP_strict（单精度或双精度浮点数）表达式遵循IEEE754算术规范",
                    "super	表明当前对象的父类型的引用或者父类型的构造方法",
                    "switch	分支语句结构的引导词",
                    "synchronized	表明一段代码需要同步执行",
                    "this	指向当前实例对象的引用",
                    "throw	抛出一个异常",
                    "throws	声明在当前定义的成员方法中所有需要抛出的异常",
                    "transient	声明不用序列化的成员域",
                    "try	尝试一个可能抛出异常的程序块",
                    "void	声明当前成员方法没有返回值",
                    "volatile表明两个或者多个变量必须同步地发生变化",
                    "while　用在循环结构中",
            };


    ListView lv;
    EditText et;

    List<String> mList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        et = (EditText) findViewById(R.id.et);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mList);
        lv.setAdapter(adapter);
        et.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //只要文本改变，去匹配
        // 延迟搜索
        // 输入完毕后，1秒之后，在去匹配


        //只要输入，就会执行该方法
        //我们需要取消前一次搜索，重新开始延迟搜索；
        handler.removeCallbacks(run);
        handler.postDelayed(run, 1000);
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    private Runnable run = new Runnable() {
        @Override
        public void run() {
            mList.clear();
            String s = et.getText().toString();
            if (s.length() > 0) {
                //匹配字符串
                for (String s1 : search) {
                    if (s1.contains(s)) {//class
                        mList.add(s1.toString());
                    }
                }
            }
            adapter.notifyDataSetChanged();
        }
    };

    @Override
    public void afterTextChanged(Editable s) {

    }


}
