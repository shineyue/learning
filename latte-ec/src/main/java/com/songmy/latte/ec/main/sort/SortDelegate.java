package com.songmy.latte.ec.main.sort;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.songmy.latte.delegates.bottom.BottomItemDelegate;
import com.songmy.latte.ec.R;

/**
 * @author mysong
 * created on: 2018/11/19 19:40
 * description:
 */

public class SortDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_sort;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
