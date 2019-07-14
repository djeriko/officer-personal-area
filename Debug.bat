@echo off

cd .\Source || exit /b 1
call .\gradlew assembleDebug || exit /b 1
if not exist ..\Build mkdir ..\Build || exit /b 1
copy /Y .\app\build\outputs\apk\debug\app-debug.apk ..\Build\app-debug.apk || exit /b 1
echo SUCCESS: app-debug.apk is created in 'Build' folder