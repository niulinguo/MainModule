package com.niles.main.splash;

import com.niles.appbase.ui.loading.BaseLoadingPresenter;

/**
 * Created by Niles
 * Date 2018/10/29 18:20
 * Email niulinguo@163.com
 */
public interface SplashPresenter extends BaseLoadingPresenter<SplashView> {

    void requestConfig();
}
