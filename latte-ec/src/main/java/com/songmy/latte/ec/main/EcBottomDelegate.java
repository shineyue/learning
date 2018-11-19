package com.songmy.latte.ec.main;

import android.graphics.Color;

import com.songmy.latte.delegates.bottom.BaseBottomDelegate;
import com.songmy.latte.delegates.bottom.BottomItemDelegate;
import com.songmy.latte.delegates.bottom.BottomTabBean;
import com.songmy.latte.delegates.bottom.ItemBuilder;
import com.songmy.latte.ec.main.index.IndexDelegate;
import com.songmy.latte.ec.main.sort.SortDelegate;

import java.util.LinkedHashMap;

/**
 * @author mysong
 * created on: 2018/11/19 19:22
 * description:
 */

public class EcBottomDelegate extends BaseBottomDelegate {
    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItems(ItemBuilder builder) {
        final LinkedHashMap<BottomTabBean, BottomItemDelegate> items = new LinkedHashMap<>();
        items.put(new BottomTabBean("{fa-home}", "主页"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-sort}", "分类"), new SortDelegate());
        items.put(new BottomTabBean("{fa-compass}", "发现"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-shopping-cart}", "购物车"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-user}", "我的"), new IndexDelegate());
        return builder.addItems(items).build();
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    @Override
    public int setClickColor() {
        return Color.parseColor("#ffff8800");
    }
}
