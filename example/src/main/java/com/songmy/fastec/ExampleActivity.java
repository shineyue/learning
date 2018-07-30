package com.songmy.fastec;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.songmy.latte.activities.ProxyActivity;
import com.songmy.latte.app.Latte;
import com.songmy.latte.delegates.LatteDelegate;
import com.songmy.latte.ec.launcher.LauncherDelegate;
import com.songmy.latte.ec.launcher.LauncherScrollDelegate;
import com.songmy.latte.ec.sign.SignUpDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Toast.makeText(Latte.getApplicationContext(), "传入Context啦", Toast.LENGTH_SHORT).show();
//    }
}
