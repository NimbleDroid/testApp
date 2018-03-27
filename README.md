# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

This is a stand alone test app skeleton, which can be used to write Espresso/UIAutomator tests targetting any external APK.

Note: this app is generic and can be used in many ways, but we designed it specifically to profile performance issues, so there are NimbleDroid specific Log.i messages included here. For more info please refer to the NimbleDroid product website at https://nimbledroid.com

### Instructions ###
To properly use this skeleton, you need to know the package name and launch activity class of the app to be tested. Also there are 2 files which need to be modified with this information before creating the actual test flows:
1. app/build.gradle - need to add the package name for the APK to be tested. (i.e. change "INSERT PACKAGE NAME OF APP TO TEST HERE" to something like "com.my.app")

2. app/src/androidTest/java/com/nimbledroid/blackboxtest/EspressoTests.java - need to set 2 static variables with the appropriate package name and launch activity class name:
(i.e. change
    private static final String APP_PACKAGE = "PACKAGE NAME HERE";
    private static final String ACTIVITY_CLASS = "START ACTIVITY CLASS HERE";

	  to
	  
    private static final String APP_PACKAGE = "com.my.app";
    private static final String ACTIVITY_CLASS = "com.my.app.launch.activity";
)

Build command: ./gradlew assembleAndroidTest

Need to resign both this test app and the target APK with the same key

Then install both on device/emulator and run instrumentation as follows:

Instrumentation command: adb shell am instrument -w -r -e class com.nimbledroid.blackboxtest.EspressoTestsi com.nimbledroid.blackboxtest/android.support.test.runner.AndroidJUnitRunner
### Who do I talk to? ###

ilya@nimbledroid.com
