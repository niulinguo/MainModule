package com.niles.mainmodule;

import android.annotation.SuppressLint;
import android.app.Application;
import android.util.Log;

import com.niles.appbase.AppConfig;
import com.niles.appbase.AppManager;
import com.niles.http.HttpConfig;
import com.niles.http.converter.StringConverterFactory;
import com.niles.loading.LoadingManager;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Niles
 * Date 2018/10/29 13:31
 * Email niulinguo@163.com
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppManager.init(new AppConfig.Builder()
                .setApp(this)
                .setDebug(BuildConfig.DEBUG)
                .setHttpConfig(new HttpConfig.Builder()
                        .setBaseUrl("http://www.wanandroid.com")
                        .setLogger(new HttpLoggingInterceptor.Logger() {
                            @SuppressLint("LogNotTimber")
                            @Override
                            public void log(String message) {
                                Log.e("http", message);
                            }
                        })
                        .addConverterFactory(StringConverterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build())
                .setLoadingConfig(LoadingManager.createLoadingConfig())
                .build());
    }
}
