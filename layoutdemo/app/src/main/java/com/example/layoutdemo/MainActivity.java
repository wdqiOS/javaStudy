package com.example.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void myclick(View v) {
        switch (v.getId()) {
            case R.id.frame:
                Log.e("btn", "帧布局");
                startActivity(new Intent(this, FrameActivity.class));
                break;
            case R.id.btn2:
                Log.e("btn", "表格布局");
                startActivity(new Intent(this, TableActivity.class));
                break;
            case R.id.btn3:
                Log.e("btn", "网格布局");
                startActivity(new Intent(this, GridActivity.class));
                break;
            case R.id.btn4:
                Log.e("btn", "约束布局");
                break;
            default:
                break;
        }

    }
}
