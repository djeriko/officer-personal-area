[![Build status](https://build.appcenter.ms/v0.1/apps/b659d4d8-c0df-4f70-a399-c6071e0122a5/branches/master/badge)](https://appcenter.ms)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/93ba9d7b917348a0a5a342a93342bdcb)](https://www.codacy.com/app/viktor_semenov/officer-personal-area?utm_source=github.com&utm_medium=referral&utm_content=victorx64/officer-personal-area&utm_campaign=Badge_Grade)
[![0pdd](http://www.0pdd.com/svg?name=victorx64/officer-personal-area)](http://www.0pdd.com/p?name=victorx64/officer-personal-area)

# Officer Personal Area

## Build the app from the command line

On Windows you need to specify paths to `JDK/bin` and `Android SDK Build Tools` in `PATH` Environment Variable.

### Build a debug APK

For immediate app testing and debugging, you can build a debug APK. The debug APK is signed with a debug key provided by the SDK tools and allows debugging through `adb`.
To build a debug APK, open a command line and navigate to the root directory of the repository. To initiate a debug build, invoke the `Debug`:

-   On Windows:

    ```Batchfile
    Debug.bat
    ```

-   On Mac or Linux:
    > @TODO #1 Create a bash script for building a debug APK

This creates an APK named `app-debug.apk` in `Build` directory. The file is already signed with the debug key and aligned with [zipalign](https://developer.android.com/studio/command-line/zipalign), so you can immediately install it on a device.

### Build a release APK

If you're ready to release and distribute the app, you must build a release APK that is signed with the private key. To initiate a release build, invoke the `Release`:

-   On Windows:

    ```Batchfile
    Release.bat
    ```

-   On Mac or Linux:
    > @TODO #1 Create a bash script for building a release APK

Provide the keystore password when you are asked to:

```Batchfile
Keystore password for signer #1:
```

On success, it creates an APK named `app-release-signed.apk` in `Build` directory. The app signed with the private key is ready for distribution, but you should first read more about how to [publish the app](https://developer.android.com/studio/publish/index.html) and review the [Google Play launch checklist](https://developer.android.com/distribute/tools/launch-checklist.html).
