package com.songmy.fastec;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.songmy.latte.app.Latte;
import com.songmy.latte.ec.database.DatabaseManager;
import com.songmy.latte.net.interceptors.DebugInterceptor;

/**
 * Created by songmy on 2018/3/8.
 */

public class ExampleApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withApiHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .withWeChatAppId("")
                .withWeChatAppSecret("")
                .configure();
        initStetho();
        DatabaseManager.getInstance().init(this);
    }

    private void initStetho(){
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }
}
