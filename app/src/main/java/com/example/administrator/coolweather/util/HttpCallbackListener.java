package com.example.administrator.coolweather.util;

/**
 * Created by Administrator on 2015/11/16 0016.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
