package com.jackfangqi.rxnetworklib.model;

import com.jackfangqi.rxnetworklib.Constants;

/**
 * Created by Jack Fang on 2017/1/13, 12:01.
 * Project: RxNetwork
 * Compiler: Android Studio
 * Email: jackfangqi1314@gmail.com
 */
public class SuperBaseModel {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean success() {
        return Constants.HTTP_SUCCESS_CODE == code;
    }
}
