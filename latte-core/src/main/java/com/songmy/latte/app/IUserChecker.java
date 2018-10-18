package com.songmy.latte.app;

/**
 * Created by songmy on 2018/4/19.
 * 是否有用户信息回调
 */

public interface IUserChecker {

    void onSignIn();
    void onNotSignIn();

}
