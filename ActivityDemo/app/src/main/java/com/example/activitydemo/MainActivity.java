package com.example.activitydemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    // 创建
    public static final String BUTTON_TITLE = "button_title";

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Log.i(TAG, "onCreate：");
    }

    // 初始化页面控件
    private  void initViews() {
        findViewById(R.id.buttonActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // 方式一：
//                intent.putExtra(BUTTON_TITLE, getString(R.string.lz_title));
                // 方式二：
                Bundle bundle = new Bundle();
                bundle.putString(BUTTON_TITLE, getString(R.string.lz_title));
                intent.putExtra(BUTTON_TITLE ,bundle);

                // 方式三：
                intent.putExtra("", new User());

//                startActivity(intent);
                startActivityForResult(intent, 999);
            }
        });

        findViewById(R.id.buttonDialogActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DialogActivity.class));
            }
        });


    }

    // 开始
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }
    //
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    // 暂停
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }
    // 停止
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    // 销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 999 && resultCode == RESULT_OK) {
            if (data != null) {
                setTitle(data.getStringExtra("lz"));
            }
        }
    }
}