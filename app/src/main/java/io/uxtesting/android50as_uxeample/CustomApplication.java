package io.uxtesting.android50as_uxeample;

import android.app.Application;

import io.uxtesting.UXTesting;

/**
 * Created by Morshues on 15/6/24.
 */
public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UXTesting.Init(this, "MY_APP_KEY");
    }

}
