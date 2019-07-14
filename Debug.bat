cd .\Source
call .\gradlew assembleDebug
mkdir ..\Build
copy /Y .\app\build\outputs\apk\debug\app-debug.apk ..\Build\app-debug.apk
echo SUCCESS: 'app-debug.apk' created in 'Build' folder
pause