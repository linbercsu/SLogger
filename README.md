# SLogger
A simple logger library on Android.

### How to use

```java
public class MyApplication extends Application {

    public static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        SLogger.init(BuildConfig.APPLICATION_ID, !BuildConfig.DEBUG);

        SLogger.i(TAG, "application start: package name: %s version code: %d version name: %s", BuildConfig.APPLICATION_ID, BuildConfig.VERSION_CODE, BuildConfig.VERSION_NAME);
    }
}
```