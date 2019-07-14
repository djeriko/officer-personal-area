if not exist "keystore.properties" (
    echo FAIL: File 'keystore.properties' is required in the project root directory.
    pause
    exit 1
)

cd .\Source
call .\gradlew assembleManualRelease
mkdir ..\Build
copy /Y .\app\build\outputs\apk\manualRelease\app-manualRelease.apk ..\Build\app-manualRelease.apk
echo SUCCESS: APK is created in 'Build' folder
pause
