package com.nimbledroid.blackboxtest;
import android.support.test.runner.AndroidJUnit4;

import android.app.Activity;
import android.test.suitebuilder.annotation.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;
import org.junit.Rule;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onData;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.instanceOf;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItem;
import static android.support.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.hasChildCount;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withResourceName;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.endsWith;
import android.support.test.espresso.action.CoordinatesProvider;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Tap;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.GeneralClickAction;
import android.support.test.espresso.action.ViewActions;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;

import android.view.View;
import android.content.Intent;
import android.content.Context; 

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Until;
import android.support.test.uiautomator.Direction;



//@LargeTest
@RunWith(AndroidJUnit4.class)

public class EspressoTests {
    private static final String APP_PACKAGE = "PACKAGE NAME HERE";
    private static final String ACTIVITY_CLASS = "START ACTIVITY CLASS HERE";
    private static Class<? extends Activity> activityClass, activityClass2;
    static {
        try {
            activityClass = (Class<? extends Activity>) Class.forName(ACTIVITY_CLASS);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

	
    @Rule
    public ActivityTestRule<?> activityTestRule = new ActivityTestRule<>(activityClass);

    public static Matcher<View> withIndex(final Matcher<View> matcher, final int index) {
        return new TypeSafeMatcher<View>() {
            int currentIndex = 0;

            @Override
            public void describeTo(Description description) {
                description.appendText("with index: ");
                description.appendValue(index);
                matcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                return matcher.matches(view) && currentIndex++ == index;
            }
        };
    }

	UiDevice mDevice;

	@Test
    public void customFlow() throws Exception {
        Log.i("NimbleDroidV1", "Scenario.profile");
	UiDevice mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

/* Some useful UIAutomator/Espresso functionality:

  UiObject2 b_login = mDevice.wait(Until.findObject(By.res("com.simplemobiletools.calendar", "calendar_fab")), 8000);

  onView(withIndex(withResourceName("username"),0)).perform(click());

  UiObject2 b_deny2 = mDevice.findObject(By.text("No"));

  onView(withIndex(withResourceName("password"),0)).perform( click() );
  onView(withIndex(withResourceName("password"),0)).perform( typeText("nimbledroid") );

  UiObject b_pw1 = mDevice.findObject(new UiSelector().className(android.widget.EditText.class.getName()).instance(0));
  b_pw1.click();
  b_pw1.setText("nimbledroid");

  mDevice.pressEnter();
  mDevice.pressBack();
  
*/

/* NimbleDroid begin/end bookend examples:
  Log.i("NimbleDroidV1", "Scenario.begin logIn");
  Log.i("NimbleDroidV1", "Scenario.end logIn");
*/

    }

}
