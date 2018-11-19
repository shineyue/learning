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
import com.songmy.latte.ec.main.EcBottomDelegate;
import com.songmy.latte.ec.sign.ISignListener;
import com.songmy.latte.ec.sign.SignInDelegate;
import com.songmy.latte.ec.sign.SignUpDelegate;
import com.songmy.latte.ui.launcher.ILauncherListener;
import com.songmy.latte.ui.launcher.OnLauncherFinishTag;

public class ExampleActivity extends ProxyActivity implements ISignListener, ILauncherListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Latte.getConfigurator().withActivity(this);
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }

    @Override
    public void onSignInSuccess() {
        startWithPop(new EcBottomDelegate());
    }

    @Override
    public void onSignUpSuccess() {
        startWithPop(new SignInDelegate());
    }

    @Override
    public void onLauncherFinish(OnLauncherFinishTag tag) {
        switch (tag) {
            case SIGNED:
                startWithPop(new EcBottomDelegate());
                break;
            case NOT_SIGNED:
                startWithPop(new SignInDelegate());
                break;
            default:
                break;
        }
    }
}
