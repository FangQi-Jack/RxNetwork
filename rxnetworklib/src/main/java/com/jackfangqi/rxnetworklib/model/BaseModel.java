package com.jackfangqi.rxnetworklib.model;

/**
 * Created by Jack Fang on 2017/1/13, 12:04.
 * Project: RxNetwork
 * Compiler: Android Studio
 * Email: jackfangqi1314@gmail.com
 */
public class BaseModel<T> extends SuperBaseModel {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
