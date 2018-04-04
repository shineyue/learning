package com.songmy.latte.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by songmy on 2018/3/8.
 */

public final class Latte {

    //对象的应用转入到配置项
    public static Configurator init(Context context) {
        getConfigurations().put(ConfigKeys.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static HashMap<Object, Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigs();
    }

//    public static T <?> getConfiguration(String configKey){
//
//
//    }

    public static Context getApplicationContext(){
        return (Context) getConfigurations().get(ConfigKeys.APPLICATION_CONTEXT.name());
    }


}
