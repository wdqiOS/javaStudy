package com.example.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // activity与layout进行了关联
        setContentView(R.layout.activity_test);



        // 通过findViewById将layout中的控件找出来，并转换成view
        final TextView textView = findViewById(R.id.textView);
        // 找到button这个view
        Button button = findViewById(R.id.button);
        // 设置点击事件，匿名内部类
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 为textView动态设置文本
                textView.setText(R.string.app_name);
                // 跳转到一个NewActivity
                Intent intent = new Intent(TextActivity.this, TextActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        // 自定义内部类
        // button.setOnClickListener(new MyClickListener());

    }

    // 自定义内部类
    class   MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Log.e("Demo2", "11111");
        }
    }

}
