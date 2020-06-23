package com.example.viewpagerproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ImageViewPagerAdapter extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<View> mViews;
    private int[] mLayoutIDs = {
        R.layout.view_first,
        R.layout.view_second,
        R.layout.view_third
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_adapter);

        mViewPager = findViewById(R.id.view_pager);
        // 初始化数据
        mViews = new ArrayList<>();
        for (int index = 0; index < mLayoutIDs.length; index++) {
            View view = getLayoutInflater().inflate(mLayoutIDs[index], null);
            mViews.add(view);
        }
        // 设置adapter
        mViewPager.setAdapter(mPagerAdapter);
    }

    PagerAdapter mPagerAdapter = new PagerAdapter() {
        @Override
        public int getCount() {
            return mLayoutIDs.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View child = mViews.get(position);
            container.addView(child);
            return child;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
           container.removeView(mViews.get(position));
        }
    };
}