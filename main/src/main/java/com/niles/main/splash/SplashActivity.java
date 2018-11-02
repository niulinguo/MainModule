package com.niles.main.splash;

import android.os.Bundle;

import com.niles.appbase.ui.loading.BaseLoadingActivity;
import com.niles.main.R;

/**
 * 启动页
 * - App 启动的第一个页面
 * - 通过设置 Theme 来防止白屏\黑屏现象
 */
public class SplashActivity extends BaseLoadingActivity<SplashPresenter> implements SplashView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getPresenter().start();
    }

    @Override
    protected SplashPresenter createPresenter() {
        return new SplashPresenterImpl(this);
    }

    @Override
    public void onLoadSuccess(Object... objects) {

    }

    @Override
    public void onLoadFailure(Object... objects) {

    }
}
