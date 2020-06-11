package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ctx_btn:演示ContextMenu
        // 1.注册
        registerForContextMenu(findViewById(R.id.ctx_btn));
        // 2. 创建 onCreateContextMenu
        // 3. 菜单项的操作 onContextItemSelected
        // 4. 为按钮设置上下文操作模式
    }

    // 创建ContextMenu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context, menu);
    }
    // ContextMenu菜单项的操作
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete:
                Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opera1:
                Toast.makeText(this, "操作1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opera2:
                finish();
                break;
            default:
                break;
        }
        return super.onContextItemSelected(item);
    }

    // 创建OptionMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 加载菜单资源
        getMenuInflater().inflate(R.menu.option, menu);
        return true;
    }

    // OptionMenu菜单项的选中方法
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                Toast.makeText(this, "保存", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}