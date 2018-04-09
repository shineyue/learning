package com.songmy.latte.ui.launcher;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * Created by songmy on 2018/4/8.
 **/

public class LauncherHolderCreator implements CBViewHolderCreator<LauncherHolder>{

    @Override
    public LauncherHolder createHolder() {
        return new LauncherHolder();
    }

}
