package com.songmy.latte.wechat;

import android.app.Activity;

import com.songmy.latte.app.ConfigKeys;
import com.songmy.latte.app.Latte;
import com.songmy.latte.wechat.callbacks.IWeChatSignInCallback;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/**
 * @author mysong
 * created on: 2018/10/24 17:11
 * description:
 */

public class LatteWechat {

    static final String APP_ID = Latte.getConfiguration(ConfigKeys.WE_CHAT_APP_ID);
    static final String APP_SECRET = Latte.getConfiguration(ConfigKeys.WE_CHAT_APP_SECRET);
    private final IWXAPI wxAPI;
    private IWeChatSignInCallback mSignInCallback = null;

    private static final class Holder {
        private static final LatteWechat INSTANCE = new LatteWechat();
    }

    public static LatteWechat getInstance() {
        return Holder.INSTANCE;
    }

    private LatteWechat() {
        final Activity activity = Latte.getConfiguration(ConfigKeys.ACTIVITY);
        wxAPI = WXAPIFactory.createWXAPI(activity, APP_ID, true);
        wxAPI.registerApp(APP_ID);
    }

    public final IWXAPI getWxAPI() {
        return wxAPI;
    }

    public LatteWechat onSignInSuccess(IWeChatSignInCallback callback){
        this.mSignInCallback = callback;
        return this;
    }

    public IWeChatSignInCallback getSignInCallback() {
        return mSignInCallback;
    }

    public final void signIn() {
        final SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "random_state";
        wxAPI.sendReq(req);
    }

}
