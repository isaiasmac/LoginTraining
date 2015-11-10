package iapps.cl.logintraining;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by iSaias on 11/9/15.
 */
public class MyApplication extends Application {

    private Tracker mTracker;

    @Override
    public void onCreate() {
        super.onCreate();

        FacebookSdk.sdkInitialize(getApplicationContext());

    }

    /**
     * Gets the default {@link Tracker} for this {@link Application}.
     * @return tracker
     */
    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG

            mTracker = analytics.newTracker("UA-69943111-1");
            mTracker.enableExceptionReporting(true);
            mTracker.enableAutoActivityTracking(true);
        }
        return mTracker;
    }


}
