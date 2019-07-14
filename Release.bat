if not exist "keystore.properties" (
    echo FAIL: File 'keystore.properties' is required in the project root directory.
    pause
    exit 1
)

cd .\Source
call .\gradlew assembleRelease
mkdir ..\Build
copy /Y .\app\build\outputs\apk\release\app-release.apk ..\Build\app-release.apk
echo SUCCESS: 'app-release.apk' created in 'Build' folder
pause