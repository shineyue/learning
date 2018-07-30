package com.songmy.latte.app;

import com.songmy.latte.util.LattePreference;

/**
 * Created by songmy on 2018/4/19.
 */

public class AccountManager {

    private enum SignTag {
        SIGN_TAG
    }

    //保存用户登录状态，登录后调用
    public static void setSignState(boolean state) {

    }

    private static boolean isSignIn() {
        return false;
//        return LattePreference.getAppFlag()
    }
}
