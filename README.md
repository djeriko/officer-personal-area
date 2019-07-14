[![Build status](https://build.appcenter.ms/v0.1/apps/b659d4d8-c0df-4f70-a399-c6071e0122a5/branches/master/badge)](https://appcenter.ms)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/93ba9d7b917348a0a5a342a93342bdcb)](https://www.codacy.com/app/viktor_semenov/officer-personal-area?utm_source=github.com&utm_medium=referral&utm_content=victorx64/officer-personal-area&utm_campaign=Badge_Grade)

# Officer Personal Area

## Build the app from the command line

### Build a debug APK

For immediate app testing and debugging, you can build a debug APK. The debug APK is signed with a debug key provided by the SDK tools and allows debugging through `adb`.
To build a debug APK, open a command line and navigate to the root directory of the repository. To initiate a debug build, invoke the `Debug`:

-   On Windows:

    ```Batchfile
    Debug.bat
    ```

-   On Mac or Linux:
    TODO

This creates an APK named `app-debug.apk` in `Build` directory. The file is already signed with the debug key and aligned with [zipalign](https://developer.android.com/studio/command-line/zipalign), so you can immediately install it on a device.

### Build a release APK

If you're ready to release and distribute the app, you must build a release APK that is signed with the private key. Ask `keystore.properties` file from the Architect to be able to sign the release APK. `keystore.properties` must be placed in the root directory of the repository before building the APK. To initiate a release build, invoke the `Release`:

-   On Windows:

    ```Batchfile
    Release.bat
    ```

-   On Mac or Linux:
    TODO

This creates an APK named `app-release.apk` in `Build` directory. The app signed with the private key is ready for distribution, but you should first read more about how to [publish the app](https://developer.android.com/studio/publish/index.html) and review the [Google Play launch checklist](https://developer.android.com/distribute/tools/launch-checklist.html).
