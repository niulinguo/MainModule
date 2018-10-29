package com.niles.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 启动页
 * App 启动的第一个页面
 * 通过设置 Theme 来防止白屏\黑屏现象
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
