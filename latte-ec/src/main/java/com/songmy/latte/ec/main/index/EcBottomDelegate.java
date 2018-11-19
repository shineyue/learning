package com.songmy.latte.ec.main.index;

import com.songmy.latte.delegates.bottom.BaseBottomDelegate;
import com.songmy.latte.delegates.bottom.BottomItemDelegate;
import com.songmy.latte.delegates.bottom.BottomTabBean;
import com.songmy.latte.delegates.bottom.ItemBuilder;

import java.util.LinkedHashMap;

/**
 * @author mysong
 * created on: 2018/11/19 19:22
 * description:
 */

public class EcBottomDelegate extends BaseBottomDelegate {
    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItems(ItemBuilder builder) {
        return null;
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    @Override
    public int setClickColor() {
        return 0;
    }
}
