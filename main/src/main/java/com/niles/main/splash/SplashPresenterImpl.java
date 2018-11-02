package com.niles.main.splash;

import android.support.annotation.NonNull;

import com.google.gson.JsonObject;
import com.niles.appbase.ui.loading.BaseLoadingPresenterImpl;
import com.niles.main.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Niles
 * Date 2018/10/29 18:21
 * Email niulinguo@163.com
 */
public class SplashPresenterImpl extends BaseLoadingPresenterImpl<SplashView> implements SplashPresenter {

    SplashPresenterImpl(SplashView view) {
        super(view);
    }

    @Override
    public void start() {
        super.start();
        getView().showLoading(null);
        requestConfig();
    }

    @Override
    public void requestConfig() {
        getHttpManager().getService(ApiService.class).getConfig().enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(@NonNull Call<JsonObject> call, @NonNull Response<JsonObject> response) {
                getView().hideLoading();
                JsonObject body = response.body();
                if (body != null) {
                    getView().hideLoading();
                    getView().toast(body.toString());
                } else {
                    getView().showLoading(getLoaderProvider().error());
                }
            }

            @Override
            public void onFailure(@NonNull Call<JsonObject> call, @NonNull Throwable t) {
                getView().showLoading(getLoaderProvider().timeout());
            }
        });
    }
}
