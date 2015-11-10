package iapps.cl.logintraining;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by iSaias on 11/9/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FacebookSdk.sdkInitialize(getApplicationContext());

    }


}
