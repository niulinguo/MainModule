package com.niles.main;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Niles
 * Date 2018/10/29 18:16
 * Email niulinguo@163.com
 */
public interface ApiService {

    @GET("/tools/mockapi/2793/kdd_config")
    Call<JsonObject> getConfig();
}
