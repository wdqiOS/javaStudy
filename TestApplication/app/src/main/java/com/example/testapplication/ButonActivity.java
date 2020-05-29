package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButonActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buton);

        // 方式一：自定义内部类
        // 1、获取按钮
        Button btn1 = findViewById(R.id.btn1);
        // 点击事件：被点击时触发的事件
        MyClickListener mc1 = new MyClickListener();
        btn1.setOnClickListener(mc1); // 为按钮注册点击事件监听器

        // 方式二、匿名内部类，适用于有唯一操作
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 在控制台输出
                Log.e("TAG", "======== 匿名内部类 =======");
            }
        });

        // 方式三：当前Activity去实现点击事件
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        // 方式四：xml文件中绑定点击事件

    }

    @Override
    public void onClick(View v) {
        Log.e("TAG", "用本类实现实现了OnClickListener");
    }

    // 自定义内部类
    class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // 在控制台输出一条语句
            Log.e("TAG", "刚刚点击的按钮是注册了内部类监听器对象的按钮");
        }
    }

    // 自定义点击方法,xml文件中绑定
    // 参数：被点击的对象
    public void myClick(View v) {
        Log.e("TAG", "xml文件绑定");
        switch (v.getId()) {
            case R.id.btn4:
                Log.e("TAG", "btn4======");
                break;
            case R.id.btn5:
                Log.e("TAG", "btn5======");
                break;
            default:
                break;
        }
    }
}
