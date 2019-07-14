@echo off

cd .\Source || exit /b 1
call .\gradlew assembleRelease || exit /b 1
if not exist ..\Build mkdir ..\Build || exit /b 1
copy /Y .\app\build\outputs\apk\release\app-release.apk ..\Build\app-release-unsigned.apk || exit /b 1
call zipalign -f -p 4 ..\Build\app-release-unsigned.apk ..\Build\app-release-unsigned-aligned.apk || exit /b 1
call apksigner sign --ks .\app\release-key.jks --out ..\Build\app-release-signed.apk ..\Build\app-release-unsigned-aligned.apk || exit /b 1
call apksigner verify ..\Build\app-release-signed.apk || exit /b 1
echo SUCCESS: app-release-signed.apk is created in 'Build' folder
