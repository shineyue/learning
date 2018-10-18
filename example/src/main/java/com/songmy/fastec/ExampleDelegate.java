package com.songmy.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.songmy.latte.app.Latte;
import com.songmy.latte.delegates.LatteDelegate;
import com.songmy.latte.net.RestClient;
import com.songmy.latte.net.callback.IError;
import com.songmy.latte.net.callback.IFailure;
import com.songmy.latte.net.callback.ISuccess;

/**
 * Created by songmy on 2018/3/14.
 */

public class ExampleDelegate extends LatteDelegate{

    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        testRestClient();
    }

    private void testRestClient(){
        RestClient.builder()
                .url("http://www.wanandroid.com/tools/mockapi/11736/userprofile")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(getContext(), response, Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void OnError(int code, String msg) {

                    }
                })
                .build().get();
    }
}
