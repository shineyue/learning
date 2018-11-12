package com.songmy.latte.wechat.templates;

import com.songmy.latte.activities.ProxyActivity;
import com.songmy.latte.delegates.LatteDelegate;
import com.songmy.latte.wechat.BaseWXEntryActivity;
import com.songmy.latte.wechat.LatteWechat;

/**
 * @author mysong
 * created on: 2018/10/19 17:06
 * description:
 */

public class WXEntryTemplate extends BaseWXEntryActivity {

    @Override
    protected void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onSignInSuccess(String userInfo) {
        LatteWechat.getInstance().getSignInCallback().onSignInSuccess(userInfo);
    }
}
