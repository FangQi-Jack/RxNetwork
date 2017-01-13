package com.jackfangqi.rxnetworklib.rx;

import rx.Subscriber;

/**
 * Created by Jack Fang on 2017/1/13, 12:09.
 * Project: RxNetwork
 * Compiler: Android Studio
 * Email: jackfangqi1314@gmail.com
 */
public abstract class RxSubscriber<T> extends Subscriber<T> {
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(T t) {
        _onNext(t);
    }

    public abstract void _onNext(T t);

    public abstract void _onError(int errorCode, String message);
}
