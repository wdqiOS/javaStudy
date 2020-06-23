package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);

        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.height = (int)(d.getHeight() * 0.6); // 高度设置为屏幕的0.6
        p.width = (int)(d.getWidth() * 0.7); // 宽度设置为屏幕的0.7
        getWindow().setAttributes(p);

        Button btn = findViewById(R.id.btnFinish);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogActivity.this.finish();
            }
        });
    }
}