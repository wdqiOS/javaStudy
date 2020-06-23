package com.example.fragementdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity implements ListFragment.OnTitleClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find views on onclick event .
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // static load fragment
                startActivity(new Intent(MainActivity.this, StaticLoadFragmentActivity.class));
            }
        });

        // 1. container 2. fragment 3. fragment--->container
        ListFragment fragment = new ListFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.listContainer, fragment)
                .commit();

//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.detailContainer, new ListFragment())
//                .commit();
    // activity---> fragment中传值
        ListFragment listFragment = ListFragment.newInstance("李哲");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.detailContainer, listFragment)
                .commit();
        // 设置回调
        listFragment.setOnTitleClickListener(this);
        // 移除某个fragment
//        getSupportFragmentManager()
//                .beginTransaction()
//                .remove(fragment)
//                .commit();

    }

    @Override
    public void onClick(String title) {
        setTitle(title);
    }
}