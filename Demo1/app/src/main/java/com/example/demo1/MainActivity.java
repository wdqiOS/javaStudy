package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.demo1.model.Food;
import com.example.demo1.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText mNameEditText;
    private RadioGroup mSexRadioGroup;
    private CheckBox mHotCheckBox;
    private CheckBox mFishCheckBox;
    private CheckBox mSourCheckBox;
    private SeekBar mSeekBar;
    private Button mSearchButton;
    private ToggleButton mToggleButton;
    private ImageView mFoodImageView;
    private List<Food> mFoods;
    private Person mPerson;
    private List<Food> mFoodResult;
    private boolean mIsHot;
    private boolean mIsFish;
    private boolean mIsSour;
    private int mPrice;
    private int mCurrentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化控件
        findViews();
        // 初始化数据
        initData();
        // 为控件添加监听器，实现基本功能
        setListeners();
        // 自测
    }

    // 初始化数据
    private void initData() {
        // new 出来一个空的事物 List
        mFoods = new ArrayList<Food>();

        // 初始化添加的数据
        mFoods.add(new Food("麻辣香锅", 55, R.drawable.malaxiangguo, false, false, false));
        mFoods.add(new Food("水煮鱼", 48, R.drawable.shuizhuyu, false, false, false));
        mFoods.add(new Food("麻辣火锅", 80, R.drawable.malahuoguo, false, false, false));
        mFoods.add(new Food("清蒸鲈鱼", 68, R.drawable.qingzhengluyu, false, false, false));
        mFoods.add(new Food("桂林米粉", 15, R.drawable.guilin, false, false, false));
        mFoods.add(new Food("上汤娃娃菜", 28, R.drawable.wawacai, false, false, false));
        mFoods.add(new Food("红烧肉", 60, R.drawable.hongshaorou, false, false, false));
        mFoods.add(new Food("木须肉", 40, R.drawable.muxurou, false, false, false));
        mFoods.add(new Food("酸菜牛肉面", 35, R.drawable.suncainiuroumian, false, false, false));
        mFoods.add(new Food("西芹炒百合", 38, R.drawable.xiqin, false, false, false));
        mFoods.add(new Food("酸辣汤", 40, R.drawable.suanlatang, false, false, false));

        // 初始化人
        mPerson = new Person();

        // 搜索菜的结果
        mFoodResult = new ArrayList<Food>();
    }

    // 获取控件
    private void findViews() {
        mNameEditText = findViewById(R.id.nameEditText);
        mSexRadioGroup = findViewById(R.id.sexRadioGroup);
        mHotCheckBox = findViewById(R.id.hotCheckbox);
        mFishCheckBox = findViewById(R.id.fishCheckbox);
        mSourCheckBox = findViewById(R.id.sourCheckbox);
        mSeekBar = findViewById(R.id.priceSeekBar);
        mSeekBar.setProgress(30);
        mSearchButton = findViewById(R.id.searchButton);
        mToggleButton = findViewById(R.id.showToggleButton);
        mToggleButton.setChecked(true);
        mFoodImageView = findViewById(R.id.foodImageView);
    }

    // 为控件添加监听器，实现基本功能
    private void setListeners() {
        // editText加入监听
        mNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                    if (mPerson != null) {
                        mPerson.setName(s.toString());
                    }
            }
        });
        // 1. 性别监听器
//        RadioGroupListener radioGroupListener = new RadioGroupListener();
        // 方式二：匿名内部类
        mSexRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.maleRadioButton:
                        mPerson.setSex("男");
                        break;
                    case R.id.femaleRadioButton:
                        mPerson.setSex("女");
                        break;
                    default:
                        break;
                }
            }
        });

        // 设置复选框Listener
        mHotCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsHot = isChecked;
            }
        });

        mFishCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsFish = isChecked;
            }
        });
        mSourCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsSour = isChecked;
            }
        });

        // SeekBar监听
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // 价格
                mPrice = seekBar.getProgress();
                Toast.makeText(MainActivity.this, "价格：" + mPrice, Toast.LENGTH_SHORT).show();
            }
        });

        // Button 监听
        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 查找菜品
                search();
            }
        });
        mToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mToggleButton.isChecked()) {
                    // 下一个
                    mCurrentIndex++;
                    if (mCurrentIndex < mFoodResult.size()) {
                        mFoodImageView.setImageResource(mFoodResult.get(mCurrentIndex).getPic());
                    } else {
                        Toast.makeText(MainActivity.this, "没有啦！", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    if (mCurrentIndex < mFoodResult.size()) {
                        String foodName = mFoodResult.get(mCurrentIndex).getName();
//                        String personName = mNameEditText.getText().toString();
                        String personName = mPerson.getName();
                        String sex = mPerson.getSex();

                        Toast.makeText(MainActivity.this, "菜名: "+ foodName + "，人名："+personName+"，性别："+sex, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "没有啦！", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });


    }

    // 查找菜品
    private void search() {
        // 结果列表每次清空
        // 遍历所有菜
        // 如果符合条件，则加入到我们的结果列表中
        if (mFoodResult == null) {
            mFoodResult = new ArrayList<>();
        }
        // 先清除之前的结果
        mFoodResult.clear();
        // 当前显示的是结果中第几个菜
        mCurrentIndex = 0;

        for (int index = 0; index < mFoods.size(); index++) {
            Food food = mFoods.get(index);
            if (food != null) {
                // 价格要小于设定的价格
                // 是顾客选择的口味
                if (food.getPrice() < mPrice &&
                        (food.isHot() == mIsHot
                                || food.isFish() == mIsFish
                                || food.isSour() == mIsSour)) {
                    mFoodResult.add(food);
                }
            }
        }
        // 先显示第一张图片
        if (mCurrentIndex < mFoodResult.size()) {
            mFoodImageView.setImageResource(mFoodResult.get(mCurrentIndex).getPic());
        }
    }

    // 方式一：自定义内部类
    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

        }
    }
}
