package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // Activity: 可视化的界面
    // public class xxxActivity extends Activity{}

    // 1. 快捷键的设置
    // 2. 常用快捷键
    // 格式化代码 cmd + option + l
    // 撤销 cmd+z  反撤销 cmd + shift + z
    // 提示代码： shift+cmd+空格
    // 代码自动修正 cmd+enter
    // 显示文档说明cmd+q
    // 查找 cmd+f
    // 全局查找 cmd+shift+f
    // 3. 调试技巧(写日志 断点)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置内容视图
        //  R: 为每一个资源文件按类别分配一个索引
        // 使程序员可以通过R.类别名.资源名去操作对应的资源
//        setContentView(R.layout.activity_main);
        // 1. 根布局为线性布局
        LinearLayout ll = new LinearLayout(this);
        // 2. 设置宽高
        ll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        // 3. 设置背景色为红色
        ll.setBackgroundColor(Color.RED);
        // 4. 指定此Activity的内容视图为该线性布局
//        setContentView(ll);

//        setContentView(createTestView(this));

//        setContentView(R.layout.linearlayout_test);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
    }

    // 代码创建测试view
    public  static  View createTestView(MainActivity e) {
        // 1. 根布局为线性布局
        LinearLayout ll = new LinearLayout(e);
        // 2. 设置宽高
        ll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        // 3. 设置背景色为红色
        ll.setBackgroundColor(Color.RED);


        TextView tv = new TextView(e);
        tv.setText("你好");
        ll.addView(tv);

        TextView tv1 = new TextView(e);
        tv1.setText("你好");
        ll.addView(tv1);


        return  ll;
    }


    // 注册按钮点击事件
    public  void register(View v) {
        // 1、判断姓名、密码是否为空
        EditText nameEdt = findViewById(R.id.name);
        EditText pwdEdt = findViewById(R.id.pwd);
        final ProgressBar progressBar = findViewById(R.id.pro_bar);

        String name = nameEdt.getText().toString();
        String pwd = pwdEdt.getText().toString();

        if (name.equals("") || pwd.equals("")) {
            // 2. 如果为空，则提示
            // 无焦点提示
            // 参数1：环境上下文
            // 参数2：提示文字
            // 参数3：提示持续时间
            // 参数3：提示持续时间
            Toast.makeText(this, "姓名或密码不能为空", Toast.LENGTH_SHORT).show();
        } else {
            // 3. 都不为空，则出现进度条
            progressBar.setVisibility(View.VISIBLE);
            new Thread() {
                @Override
                public  void  run() {
                    for(int i = 1; i <= 100; i++) {
                        progressBar.setProgress(i);
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        }


    }
}
