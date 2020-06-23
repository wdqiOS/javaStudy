package com.example.dialogdemo;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;

// 1、设计自定义对话框样式---dialog_layout.xml
// 2、设计style（去标题栏、去背景）
// 3、将第一步的布局应用到当前自定义对话框
// 4、实例对话框（参数1：环境上下文 参数2：第二步创建的style R.style.MyDialog），并展示show();
public class MyDialog extends Dialog {
    public MyDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        // 为对话框设置布局
       setContentView(R.layout.dialog_layout);

       // 确定按钮
       findViewById(R.id.yes_btn).setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v) {
               // 退出整个程序
               System.exit(0);
           }
       });
       findViewById(R.id.no_btn).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               dismiss();
           }
       });


    }

//    public MyDialog(@NonNull Context context) {
//        super(context);
//        // 为对话框设置布局
//       setContentView(R.layout.dialog_layout);
//    }


}
