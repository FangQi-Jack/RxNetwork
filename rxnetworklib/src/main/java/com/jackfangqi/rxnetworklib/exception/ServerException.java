package com.jackfangqi.rxnetworklib.exception;

/**
 * Created by Jack Fang on 2017/1/13, 12:05.
 * Project: RxNetwork
 * Compiler: Android Studio
 * Email: jackfangqi1314@gmail.com
 */
public class ServerException extends RuntimeException {
    private int errorCode;

    public ServerException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
