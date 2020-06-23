package com.example.dialogdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showNormalDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("提醒");
        dialog.setMessage("您确定退出程序吗？");
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();
    }

   public  void myClick(View v) {
        switch (v.getId()) {
            case R.id.normal_dialog_btn:

                // 方式一:
                /*
                Toast.makeText(this, R.string.normal_dialog, Toast.LENGTH_SHORT).show();
                // AlertDialog的构造方法是protected
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("提示");
                builder.setMessage("您确定退出程序吗？");
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("取消", null);
                // 展示
                builder.show();
                */
                // 方式二：
                showNormalDialog();

                break;
            case R.id.diy_dialog_btn:
                Toast.makeText(this, R.string.custom_dialog, Toast.LENGTH_SHORT).show();
                // 1. 设置布局
                // 2. 设置Style
                // 3. 自定义Dialog
                MyDialog md = new MyDialog(this, R.style.MyDialog);
                md.show();
                break;
            case R.id.popup_btn:
                showPopupWindow(v);
                break;
            case  R.id.button2:
                showArrayDialog();
                break;
            default:
                break;
        }
   }

   public void showArrayDialog() {
        final  String[] items = {"Java", "Mysql", "Android", "HTML", "C", "JavaScript"};
        // 数组适配器
       // 参数1：环境
       // 参数2：布局资源索引，每一项数据所呈现的样式android.R.layout.xxx(android.R.layout.simple_dropdown_item_1line系统自带样式)
       // 参数3：数据源
//       ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items);

       // 参数3：int textviewId:指定文本需要放在布局中对应id文本控制的位置
       ArrayAdapter adapter = new ArrayAdapter(this, R.layout.array_item_layout, R.id.item_text,items);
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("请选择")
                .setIcon(R.mipmap.ic_launcher)
                .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();
                    }
                })
                // 参数1：适配器对象(对数据显示样式的规则制定器)
                // 参数2：监听器
                .setAdapter(adapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, items[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

        builder.show();
   }

   // 设置PopupWindow
   public void showPopupWindow(View view) {
        // 准备弹窗所需要的视图对象
       View v = LayoutInflater.from(this).inflate(R.layout.popup_layout, null);
        // 1. 实例PopupWindow对象
       // 参数1：用在弹窗中的view
       // 参数2、3：弹窗的宽高
       // 参数4：是否获取焦点
       final PopupWindow window = new PopupWindow(v, 190, 35, true);
       // 2. 设置style(背景、动画)
       window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
       // 设置能响应外部的点击事件
       window.setOutsideTouchable(true);
       // 设置弹窗能响应时间
       window.setTouchable(true);
       // 1、创建动画资源
       // 2、创建一个style应用动画资源
       // 3、对当前弹窗的动画风格设置为第二步的资源索引
       window.setAnimationStyle(R.style.translate_anim);
       // 3. show
       // 参数1（anchor）：锚
       // 参数2、3：相当于锚在x、y方向上的偏移量
       window.showAsDropDown(view, -190, 0);

       // 为弹窗中的文本添加点击事件
       v.findViewById(R.id.choose).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "点击了选择", Toast.LENGTH_SHORT).show();
               window.dismiss(); // 弹窗消失
           }
       });
       v.findViewById(R.id.choose_all).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "点击了全选", Toast.LENGTH_SHORT).show();
               window.dismiss();
           }
       });
       v.findViewById(R.id.copy).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "点击了复制", Toast.LENGTH_SHORT).show();
               window.dismiss();
           }
       });
   }
}