package com.songmy.fastec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.songmy.latte.activities.ProxyActivity;
import com.songmy.latte.app.Latte;
import com.songmy.latte.delegates.LatteDelegate;
import com.songmy.latte.ec.launcher.LauncherDelegate;

public class ExampleActivity extends ProxyActivity {
    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Toast.makeText(Latte.getApplicationContext(), "传入Context啦", Toast.LENGTH_SHORT).show();
//    }
}
