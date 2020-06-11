package com.example.networkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 */
public class NetworkActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView mTextView;
    private Button mButton;
    private static final String TAG = "NetworkActivity";
    private String mResult;
    private Button mParseDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);

        findViews();
        setListeners();
    }

    public void findViews() {
        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.getButton);
        mParseDataButton = findViewById(R.id.parseDataButton);
    }

    public void setListeners() {
        mButton.setOnClickListener(this);
        mParseDataButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.getButton:
//                   https://www.imooc.com/api/teacher?type=2&page=1
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // 1. 构建URL
                        try {
                            URL url = new URL("https://www.imooc.com/api/teacher?type=2&page=1");
                            try {
                                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                                connection.setConnectTimeout(30 * 1000);
                                connection.setRequestMethod("GET");
                                connection.setRequestProperty("Content-Type", "application/json");
                                connection.setRequestProperty("Charset", "UTF-8");
                                connection.setRequestProperty("Accept-Charset", "UTF-8");
                                connection.connect(); // 发起连接
                                // 获取响应码
                                int responseCode = connection.getResponseCode();
                                String responseMessage = connection.getResponseMessage();
                                if (responseCode == HttpURLConnection.HTTP_OK) { // 表示请求成功
                                    InputStream inputStream = connection.getInputStream();
                                    String result = streamToString(inputStream);
                                    Log.e(TAG, result);
                                } else { // 表示请求失败
                                    mTextView.setText(responseMessage);
                                }

                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                    }
                });
                break;
            case R.id.parseDataButton:
                break;
            default:
                break;
        }
    }

    /***
     * 将输入流转换成字符串
     * @param is 从网络获取的输入流
     * @return 字符串
     */
    public String streamToString(InputStream is) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;

            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            baos.close();
            is.close();
            byte[] byteArray = baos.toByteArray();
            return new String(byteArray);

        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }
}