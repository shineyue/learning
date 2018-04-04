package com.songmy.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.songmy.latte.app.Latte;

/**
 * Created by songmy on 2018/3/22.
 */

public class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
